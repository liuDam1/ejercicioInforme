package es.etg.psp.informe;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import es.etg.psp.informe.informe.Informe;
import es.etg.psp.informe.informe.InformeFactory;
import es.etg.psp.informe.informe.TipoInforme;

public class Main {
    public static final String MSG_ERROR = "Se ha producido un error al ejecutar el comando";
    public static final String SALTO_LINEA = "\n";
    
    public static final String[] COMANDO_PS = { "ps", "aux" };
    public static final String[] COMANDO_DF = { "df", "-h" };
    public static final String[] COMANDO_FREE = { "free", "-h" };

    public static void main(String[] args) {
        try {
            String salidaPs = ejecutarComando(COMANDO_PS);
            String salidaDf = ejecutarComando(COMANDO_DF);
            String salidaFree = ejecutarComando(COMANDO_FREE);
            
            TipoInforme tipo = TipoInforme.MARKDOWN;
            Informe informe = InformeFactory.crearInforme(tipo);
            
            informe.generarInforme(salidaPs, salidaDf, salidaFree);
            
            System.out.println("Informe generado correctamente en: " + tipo.getNombreArchivo());
            System.exit(0);
            
        } catch (IOException e) {
            System.out.println(MSG_ERROR);
            System.exit(34);
        }
    }
    
    private static String leerSalida(Process proceso) throws IOException {
        StringBuilder resultado = new StringBuilder();
        try (BufferedReader lector = new BufferedReader(new InputStreamReader(proceso.getInputStream()))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                resultado.append(linea).append(SALTO_LINEA);
            }
        }
        return resultado.toString();
    }
    
    private static String ejecutarComando(String[] comando, String entrada) throws IOException {
        Process proceso = Runtime.getRuntime().exec(comando);

        if (entrada != null) {
            try (OutputStream output = proceso.getOutputStream();
                    PrintWriter pw = new PrintWriter(new OutputStreamWriter(output))) {
                pw.print(entrada);
                pw.flush();
            }
        }

        return leerSalida(proceso);
    }
    
    private static String ejecutarComando(String[] comando) throws IOException {
        return ejecutarComando(comando, null);
    }
}

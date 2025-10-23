package es.etg.psp.informe.informe;


import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InformeMarkdown implements Informe {
    public static final String SALTO_LINEA = "\n";
    public static final String ARCHIVO_SALIDA = "src/main/resources/informe_sistema.md";
    
    @Override
    public void generarInforme(String procesos, String disco, String memoria) {
        String contenido = generarContenidoMarkdown(procesos, disco, memoria);
        
        try (FileWriter writer = new FileWriter(ARCHIVO_SALIDA)) {
            writer.write(contenido);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public String getNombreArchivo() {
        return ARCHIVO_SALIDA;
    }
    
    private String generarContenidoMarkdown(String ps, String df, String free) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fecha = sdf.format(new Date());
        
        StringBuilder contenido = new StringBuilder();
        
        contenido.append("# Informe de Recursos del Sistema").append(SALTO_LINEA);
        contenido.append("**Fecha de generación:** ").append(fecha).append(SALTO_LINEA).append(SALTO_LINEA);
        
        contenido.append("## Procesos en Ejecución").append(SALTO_LINEA);
        contenido.append("```bash").append(SALTO_LINEA);
        contenido.append(ps).append(SALTO_LINEA);
        contenido.append("```").append(SALTO_LINEA).append(SALTO_LINEA);
        
        contenido.append("## Uso del Disco").append(SALTO_LINEA);
        contenido.append("```bash").append(SALTO_LINEA);
        contenido.append(df).append(SALTO_LINEA);
        contenido.append("```").append(SALTO_LINEA).append(SALTO_LINEA);
        
        contenido.append("## Uso de Memoria").append(SALTO_LINEA);
        contenido.append("```bash").append(SALTO_LINEA);
        contenido.append(free).append(SALTO_LINEA);
        contenido.append("```").append(SALTO_LINEA);
        
        return contenido.toString();
    }
}

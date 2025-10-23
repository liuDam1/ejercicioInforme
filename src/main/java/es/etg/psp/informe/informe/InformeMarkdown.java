package es.etg.psp.informe.informe;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InformeMarkdown implements Informe {
    public static final String SALTO_LINEA = "\n";
    public static final String ARCHIVO_SALIDA = "informe_sistema.md";
    public static final String MSG_ERROR_GUARDADO = "Error al guardar el archivo: ";
    
    // Constantes para el formato Markdown
    public static final String TITULO_PRINCIPAL = "# Informe de Recursos del Sistema";
    public static final String ETIQUETA_FECHA = "**Fecha de generación:** ";
    public static final String SECCION_PROCESOS = "## Procesos en Ejecución";
    public static final String SECCION_DISCO = "## Uso del Disco";
    public static final String SECCION_MEMORIA = "## Uso de Memoria";
    public static final String CODIGO_BASH = "```bash";
    public static final String CIERRE_CODIGO = "```";
    
    // Formato de fecha
    public static final String FORMATO_FECHA = "yyyy-MM-dd HH:mm:ss";
    
    @Override
    public void generarInforme(String procesos, String disco, String memoria) {
        String contenido = generarContenidoMarkdown(procesos, disco, memoria);
        
        try (FileWriter writer = new FileWriter(ARCHIVO_SALIDA)) {
            writer.write(contenido);
        } catch (IOException e) {
            System.out.println(MSG_ERROR_GUARDADO + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public String getNombreArchivo() {
        return ARCHIVO_SALIDA;
    }
    
    private String generarContenidoMarkdown(String ps, String df, String free) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
        String fecha = sdf.format(new Date());
        
        StringBuilder contenido = new StringBuilder();
        
        // Cabecera del documento
        contenido.append(TITULO_PRINCIPAL).append(SALTO_LINEA);
        contenido.append(ETIQUETA_FECHA).append(fecha).append(SALTO_LINEA).append(SALTO_LINEA);
        
        // Sección de procesos
        contenido.append(SECCION_PROCESOS).append(SALTO_LINEA);
        contenido.append(CODIGO_BASH).append(SALTO_LINEA);
        contenido.append(ps).append(SALTO_LINEA);
        contenido.append(CIERRE_CODIGO).append(SALTO_LINEA).append(SALTO_LINEA);
        
        // Sección de espacio en disco
        contenido.append(SECCION_DISCO).append(SALTO_LINEA);
        contenido.append(CODIGO_BASH).append(SALTO_LINEA);
        contenido.append(df).append(SALTO_LINEA);
        contenido.append(CIERRE_CODIGO).append(SALTO_LINEA).append(SALTO_LINEA);
        
        // Sección de memoria
        contenido.append(SECCION_MEMORIA).append(SALTO_LINEA);
        contenido.append(CODIGO_BASH).append(SALTO_LINEA);
        contenido.append(free).append(SALTO_LINEA);
        contenido.append(CIERRE_CODIGO).append(SALTO_LINEA);
        
        return contenido.toString();
    }
}

package es.etg.psp.informe.informe;

public interface Informe {
    void generarInforme(String procesos, String disco, String memoria);
    String getNombreArchivo();
}
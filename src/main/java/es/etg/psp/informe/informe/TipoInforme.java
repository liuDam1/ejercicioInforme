package es.etg.psp.informe.informe;


public enum TipoInforme {
    MARKDOWN("informe_sistema.md");
    
    private final String nombreArchivo;
    
    private TipoInforme(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    public String getNombreArchivo() {
        return nombreArchivo;
    }
}

package es.etg.psp.informe.informe;


public class InformeFactory {
    
    public static Informe crearInforme(TipoInforme tipo) {
        switch (tipo) {
            case MARKDOWN:
                return new InformeMarkdown();
                
            // Futuros tipos de informe
            // case XML:
            //     return new InformeXML();
            // case HTML:
            //     return new InformeHTML();
                
            default:
                throw new IllegalArgumentException("Tipo de informe no soportado: " + tipo);
        }
    }
}

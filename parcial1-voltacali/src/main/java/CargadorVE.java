public class CargadorVE {

    enum TipoConector{
        TIPO_1, TIPO_2, CCS2, CHADEMO, GBT
    }

    enum TipoCargador {
        MURAL, PEDESTAL, RAPIDO_DC, ULTRARRAPIDO, PORTATIL, BIDIRECCIONAL_V2G
    }
    enum Ubicacion {
        CENTRO_COMERCIAL, UNIVERSIDAD, ESTACION_SERVICIO, PARQUEADERO_PUBLICO, RESIDENCIAL, HOTEL, TERMINAL, FLOTA_CORPORATIVA
    }

    private String fabricante;
    private int instalacion;
    private int VoltajeNominal;
    private TipoConector tipoConector;
    private TipoCargador tipoCargador;
    private int numeroConectores;
    private int puestosParqueo;
    private double potenciaMaxima;
    private Ubicacion ubicacion;
    private double potenciaActual;

    
}

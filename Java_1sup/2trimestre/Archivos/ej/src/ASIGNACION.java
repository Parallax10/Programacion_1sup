public class ASIGNACION {
    TRABAJADORES TRABAJADORES;
    ZONAS zonas;
    String DiasTrabajadosXZona;

    public ASIGNACION(TRABAJADORES TRABAJADORES, ZONAS zonas, String diasTrabajadosXZona) {
        this.TRABAJADORES = TRABAJADORES;
        this.zonas = zonas;
        DiasTrabajadosXZona = diasTrabajadosXZona;
    }

    public TRABAJADORES getTRABAJADORES() {
        return TRABAJADORES;
    }

    public void setTRABAJADORES(TRABAJADORES TRABAJADORES) {
        this.TRABAJADORES = TRABAJADORES;
    }

    public ZONAS getZonas() {
        return zonas;
    }

    public void setZonas(ZONAS zonas) {
        this.zonas = zonas;
    }

    public String getDiasTrabajadosXZona() {
        return DiasTrabajadosXZona;
    }

    public void setDiasTrabajadosXZona(String diasTrabajadosXZona) {
        DiasTrabajadosXZona = diasTrabajadosXZona;
    }
}

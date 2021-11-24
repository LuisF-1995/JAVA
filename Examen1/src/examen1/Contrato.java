package examen1;
/**
 *
 * @author luis-1995
 */
public abstract class Contrato {
    private Persona persona;
    private Integer mesesDuracion;
    private String fechaInicioActividad;
    private Boolean selloMinTrabajo;

    public Contrato(Persona persona, Integer mesesDuracion, String fechaInicioActividad, Boolean selloMinTrabajo) {
        this.persona = persona;
        this.mesesDuracion = mesesDuracion;
        this.fechaInicioActividad = fechaInicioActividad;
        this.selloMinTrabajo = selloMinTrabajo;
    }

    public Boolean getSelloMinTrabajo() {
        return selloMinTrabajo;
    }
    
    public abstract void incorporable();
}

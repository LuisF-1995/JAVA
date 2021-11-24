package examen1;

/**
 *
 * @author luis-1995
 */
public class ContratoMensual extends Contrato{
    private Double salarioMensual;
    private Integer horasTotales;
    private String cargo;

    public ContratoMensual(Persona persona, Integer mesesDuracion, String fechaInicioActividad, Boolean selloMinTrabajo, Double salarioMensual, Integer horasTotales, String cargo) {
        super(persona, mesesDuracion, fechaInicioActividad, selloMinTrabajo);
        this.salarioMensual = salarioMensual;
        this.horasTotales = horasTotales;
        this.cargo = cargo;
    }

    @Override
    public void incorporable() {
        if(getSelloMinTrabajo()) System.out.println("Se puede incorporar al trabajo");
        else System.out.println("No se puede incorporar al trabajo");
    }
    
    public Boolean esJefe(){
        if(cargo.equals("jefe")) return true;
        else return false;
    }
}

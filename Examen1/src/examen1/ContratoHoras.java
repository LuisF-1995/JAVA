package examen1;

/**
 *
 * @author luis-1995
 */

import java.lang.*;

public class ContratoHoras extends Contrato implements Comparable{
    private Integer cantHorasMes;
    private Double valorHora;

    public ContratoHoras(Persona persona, Integer mesesDuracion, String fechaInicioActividad, Boolean selloMinTrabajo, Integer cantHorasMes, Double valorHora) {
        super(persona, mesesDuracion, fechaInicioActividad, selloMinTrabajo);
        this.cantHorasMes = cantHorasMes;
        this.valorHora = valorHora;
    }

    @Override
    public void incorporable() {
        if(!getSelloMinTrabajo()) System.out.println("No se puede incorporar al trabajo");
        else System.out.println("Se puede incorporar al trabajo");
    }

    @Override
    public int compareTo(Object o) {
        ContratoHoras horas = (ContratoHoras)o;
        if(cantHorasMes > horas.cantHorasMes) System.out.println("Objeto 1 mayor que objeto 2");
        else if (cantHorasMes < horas.cantHorasMes) System.out.println("Objeto 2 mayor que objeto 1");
        else System.out.println("Son iguales");
        return cantHorasMes - horas.cantHorasMes;
    }
}

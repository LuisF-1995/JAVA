package examen1;
/**
 *
 * @author luis-1995
 */
public class Examen1 {
    public static void main(String[] args) {
        
        // creacion de objeto persona
        Persona persona1 = new Persona("Luis", "Rodriguez", 10925, 26);
        Persona persona2 = new Persona("Ana", "Botero", 65481, 28);
        Persona persona3 = new Persona("Juan", "Ramirez", 12345, 40);
        Persona persona4 = new Persona("Albeto", "Pelufo", 0214, 30);
        
        // creacion de Contratos
        ContratoHoras empleado1 = new ContratoHoras(persona1, 10, "25/oct/2021", true, 80, 50.0);
        
        ContratoHoras empleado4 = new ContratoHoras(persona4, 5, "25/sept/2019", true, 60, 80.0);
        
        ContratoMensual empleado2 = new ContratoMensual(persona2, 2, "25/oct/2020", false, 100.5, 80, "empleado");
        
        ContratoMensual empleado3 = new ContratoMensual(persona3, 60, "25/oct/2018", true, 800.9, 60, "jefe");
        
        // Punto1: De cualquier tipo de contrato debemos poder saber si se puede incorporar al trabajo.
        empleado1.incorporable();
        empleado2.incorporable();
        empleado3.incorporable();
        System.out.println("\n");
        
        // Punto3: en contrato mensual saber si es un cargo de “jefe”.
        System.out.println(empleado2.esJefe());
        System.out.println(empleado3.esJefe());
        System.out.println("\n");
        
       // Punto2: En contratos por hora debe ser posible compararlos. Un contrato por horas es mayor a otro de acuerdo a la cantidad de horas contratadas.
       System.out.println(empleado1.compareTo(empleado4));
    }
}

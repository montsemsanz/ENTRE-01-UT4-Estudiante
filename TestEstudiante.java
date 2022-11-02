import java.util.Scanner;
/**
 * 
 * @author - Cristina López Lusarreta
 * 
 * Prueba del todas las clases
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicación
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        
          // System.out.println("Nombre: ");
        // String nombre = teclado.nextLine();

        // System.out.println("Edad: ");
        // int edad = teclado.nextInt();


        // System.out.println("Sueldo: ");
        // double sueldo = teclado.nextDouble();
        
        // teclado.nextLine();
        
        // System.out.println("Estado civil: ");
        // char estadoCivil = teclado.nextLine().charAt(0);
        
        // Persona persona = new Persona (nombre, edad, sueldo, estadoCivil);
        // System.out.println(persona.toString()); persona = new Persona (nombre, edad, sueldo, estadoCivil);
        // System.out.println(persona.toString());
        
        System.out.println(Estudiante.setNombre("MOLINA HUARTE, Isabel"));
        //Estudiante setNombre("MOLINA HUARTE, Isabel");
        String nombre = teclado.nextLine();
        
        
        
        Estudiante estudiante = new Estudiante(nombre);

       
       
       
    }
}

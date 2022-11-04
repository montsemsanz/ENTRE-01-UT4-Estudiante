/**
 * @author - Almudena Iparraguirre
 * Prueba del todas las clases
 */
/** Esto es un 
 * comentario javadoc */

public class TestEstudiante {
    /**
     * Punto de entrada a la aplicación
     */
    public static void main(String[] args) {
        String nombre = "MOLINA HUARTE, Isabel";
        System.out.println(nombre + "\n" + "*".repeat(80));
        
        UnidadTrabajo unidad = new UnidadTrabajo ("Interacción de objetos. Estructura de control iterativa"
        , 25, 11, 2022, 55, 60, 10, 30);    
        NotaEstudianteUnidad nota = new NotaEstudianteUnidad(unidad,5,6,7);
        System.out.println(nota + "\n");
        
        
        Fecha fechaFin = new Fecha(21,9,2022);
        PonderacionInstrumentos ponderacion  = new PonderacionInstrumentos(70,10,20);
        UnidadTrabajo unidad2 = new UnidadTrabajo ("Objetos y clases",fechaFin, 10, ponderacion);
        
        System.out.println("-".repeat(60));   
        NotaEstudianteUnidad nota2 = new NotaEstudianteUnidad(unidad2,6,10,7);
        System.out.println(nota2 + "\n");
        
        
        
        Fecha fechaFin2 = new Fecha(16,10,2022);
        PonderacionInstrumentos ponderacion2 = new PonderacionInstrumentos(65,10,25);
        UnidadTrabajo unidad3 = new UnidadTrabajo ("Definición de una clase. Estructura condicional",
        fechaFin2, 35,ponderacion2);
        
        System.out.println("-".repeat(60));
        NotaEstudianteUnidad nota3 = new NotaEstudianteUnidad(unidad3,8,6,9);   
        System.out.println(nota3 + "\n");
        
        Estudiante resumen = new Estudiante(nombre);
        System.out.println("-".repeat(60));
        System.out.println("Nota final de evaluación: " + resumen);
        System.out.println("-".repeat(80));
        System.out.println("-".repeat(80));
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Copia de la última UT añadida" + "\n");
    }
}

/**
 * Prueba del todas las clases
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicación
     */
    public static void main(String[] args) {
       Estudiante estudiante = new Estudiante("MOLINA HUARTE, Isabel");

       UnidadTrabajo unidad1 = new UnidadTrabajo("Interacción de objetos. Estructura de control iterativa", 25, 11, 2022, 55, 60, 10, 30);
       NotaEstudianteUnidad UT1 = new NotaEstudianteUnidad(unidad1, 5, 6, 7);
       estudiante.registrarNotaUnidad(UT1);
       
       UnidadTrabajo unidad2 = new UnidadTrabajo("Objetos y clases", 21, 9, 2022, 10, 70, 10, 20);
       NotaEstudianteUnidad UT2 = new NotaEstudianteUnidad(unidad2, 6, 10, 7);
       estudiante.registrarNotaUnidad(UT2);
       
       UnidadTrabajo unidad3 = new UnidadTrabajo("Definicion de una clase", 16, 10, 2022, 35, 65, 10, 25);
       NotaEstudianteUnidad UT3 = new NotaEstudianteUnidad(unidad3, 8, 6, 9);
       estudiante.registrarNotaUnidad(UT3);
       
       System.out.println(estudiante.toString());
    }
}


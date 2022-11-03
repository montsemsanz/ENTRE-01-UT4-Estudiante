/**
 * Prueba del todas las clases
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicación
     */
    public static void main(String[] args) {
       Estudiante estudiante = new Estudiante("Isabel");
       
       UnidadTrabajo ut = new UnidadTrabajo("Interacción de objetos. Estructura de control iterativa", 25, 11, 2022, 55, 60, 10, 30);
       
       
       
       NotaEstudianteUnidad nota = new NotaEstudianteUnidad(ut, 5, 6, 7);
       
       
       
       estudiante.registrarNotaUnidad(nota);
       
       UnidadTrabajo ut2 = new UnidadTrabajo("Objetos y clases", 21, 9, 2022, 10, 70, 10, 20);
       
      
       
       NotaEstudianteUnidad nota2 = new NotaEstudianteUnidad(ut2, 6, 10, 7);
       
       
       
       estudiante.registrarNotaUnidad(nota2);
       
       UnidadTrabajo ut3 = new UnidadTrabajo("Defincion de una clase", 16, 10, 2022, 35, 65, 10, 25);
       
       
       
       NotaEstudianteUnidad nota3 = new NotaEstudianteUnidad(ut3, 8, 6, 9);
       
       estudiante.registrarNotaUnidad(nota3);
       estudiante.print();
       
       UnidadTrabajo copia = ut3.clonar();
       
       copia.print();
       
    }
}

/**
 * Prueba del todas las clases
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicaci�n
     */
    public static void main(String[] args) {
       Estudiante estudiante = new Estudiante("MOLINA HUARTE,Isabel");
       UnidadTrabajo unidadTrabajo = new UnidadTrabajo("Interacci�n de objetos. Estructura de control iterativa",
       25, 11, 2022, 55, 60, 10, 30);
       NotaEstudianteUnidad notaEstudianteUnidad = new NotaEstudianteUnidad(unidadTrabajo, 5, 6, 7);
       estudiante.registrarNotaUnidad(notaEstudianteUnidad);
       estudiante.print();

       UnidadTrabajo unidadTrabajo2 = new UnidadTrabajo("Objetos y clases", new Fecha(21,9,2022), 10, 
       new PonderacionInstrumentos(70,10,20));
       NotaEstudianteUnidad notaEstudianteUnidad2 = new NotaEstudianteUnidad(unidadTrabajo2, 6, 10, 7);
       estudiante.registrarNotaUnidad(notaEstudianteUnidad2);

       UnidadTrabajo unidadTrabajo3 = new UnidadTrabajo("Definici�n de una clase. Estructura condicional", 
       new Fecha(16,10,2022), 35, new PonderacionInstrumentos(65,10,25));
       NotaEstudianteUnidad notaEstudianteUnidad3 = new NotaEstudianteUnidad(unidadTrabajo3, 8, 6, 9);
       estudiante.registrarNotaUnidad(notaEstudianteUnidad3);
       estudiante.print();

       System.out.println("Copia de la �ltima UT a�adida");
       unidadTrabajo.clonar(unidadTrabajo3).print();

    }
}

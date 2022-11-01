/**
 * Clase para probar todas las clases
 * @Author Aitor Zubillaga Soria
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicación
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante ("MOLINA HUARTE, Isabel");
        UnidadTrabajo unidad1 = new UnidadTrabajo ("Interacción de objetos. Estructura de control iterativa", 15, 11, 2022,55, 60, 10, 30);
        NotaEstudianteUnidad notaUnidad1 = new NotaEstudianteUnidad (unidad1, 5, 6, 7);
        estudiante1.registrarNotaUnidad(notaUnidad1);
        estudiante1.print();
        
        
        Fecha fecha1 = new Fecha(21, 9, 2022);
        PonderacionInstrumentos ponderacion1 = new PonderacionInstrumentos(6, 10, 7);
        UnidadTrabajo unidad2 = new UnidadTrabajo("Objetos y clases",fecha1,10, ponderacion1);
        NotaEstudianteUnidad notaUnidad2 = new NotaEstudianteUnidad (unidad2, 6, 10, 7);
       
    }
}

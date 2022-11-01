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
        UnidadTrabajo InteraccionDeObjetos = new UnidadTrabajo ("Interacción de objetos. Estructura de control iterativa", 15, 11, 2022,55, 60, 10, 30);
        NotaEstudianteUnidad notaUnidad1 = new NotaEstudianteUnidad (InteraccionDeObjetos, 5, 6, 7);
        estudiante1.registrarNotaUnidad(notaUnidad1);
        estudiante1.print();
       
    }
}

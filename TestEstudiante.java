/**
 * Clase para probar todas las clases
 * @Author Aitor Zubillaga Soria
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicación
     */
    public static void main(String[] args) {
        //crea el estudiante
        Estudiante estudiante1 = new Estudiante ("MOLINA HUARTE, Isabel");

        //Devuelve las notas del estudiante
        Fecha fecha1 = new Fecha(21, 9, 2022);
        PonderacionInstrumentos ponderacion2 = new PonderacionInstrumentos(70, 10, 20);
        UnidadTrabajo unidad2 = new UnidadTrabajo("Objetos y clases",fecha1,10, ponderacion2);
        NotaEstudianteUnidad notaUnidad2 = new NotaEstudianteUnidad (unidad2, 6, 10, 7);

        estudiante1.registrarNotaUnidad(notaUnidad2);

        
        Fecha fecha2 = new Fecha(16, 10, 2022);
        PonderacionInstrumentos ponderacion3 = new PonderacionInstrumentos(65, 10, 25);
        UnidadTrabajo unidad3 = new UnidadTrabajo ("Definición de una clase. Estructura condicional", fecha2, 35, ponderacion3);
        NotaEstudianteUnidad notaUnidad3 = new NotaEstudianteUnidad (unidad3, 8, 6, 9);

        estudiante1.registrarNotaUnidad(notaUnidad3);
        estudiante1.print();

        UnidadTrabajo unidad1 = new UnidadTrabajo ("Interacción de objetos. Estructura de control iterativa", 15, 11, 2022 ,55, 60, 10, 30);
        NotaEstudianteUnidad notaUnidad1 = new NotaEstudianteUnidad (unidad1, 5, 6, 7);
        estudiante1.registrarNotaUnidad(notaUnidad1);
        estudiante1.print();
        //crea un clon de las notas de la unidad3
        System.out.println("\n\n Copia de la última UT añadida\n" + unidad3.clonar());

    }
}

/**
 * Prueba del todas las clases
 * @author - Santi Lerga
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicación
     */
    public static void main(String[] args) {
       Estudiante estudiante = new Estudiante ("MOLINA HUARTE, Isabel");
       UnidadTrabajo UnidadTrabajo1 = new UnidadTrabajo("Interaccion de objetos. Estructura de control iterativa", 25, 11, 2022, 55, 60, 10, 30);
       NotaEstudianteUnidad notaUt1 = new NotaEstudianteUnidad(UnidadTrabajo1, 5, 6 ,7);
       estudiante.registrarNotaUnidad(notaUt1);
       
       UnidadTrabajo UnidadTrabajo2 = new UnidadTrabajo("Objetos y clases", new Fecha(21, 9, 2022), 10, new PonderacionInstrumentos(70, 10, 20));
       NotaEstudianteUnidad notaUt2 = new NotaEstudianteUnidad (UnidadTrabajo2, 6, 10, 7);
       estudiante.registrarNotaUnidad(notaUt2);
       
       UnidadTrabajo UnidadTrabajo3 = new UnidadTrabajo ("Definicion de ina clase. Estructura condicional", new Fecha (16, 10, 2022), 35, new PonderacionInstrumentos (65, 10, 25));
       NotaEstudianteUnidad NotaEstudiante3 = new NotaEstudianteUnidad(UnidadTrabajo3, 8, 6, 9);
       
       System.out.println("Copia de la ultima UT añadida");
       UnidadTrabajo3.clonar().print();
       
       
       
       
       
       
       
       
    }
}

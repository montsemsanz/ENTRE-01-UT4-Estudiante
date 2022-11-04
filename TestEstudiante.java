/**
 * Prueba del todas las clases
 * 
 * @author Endika
 * 
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicación
     */
    public static void main() {
       Estudiante estudiante = new Estudiante("MOLINA HUARTE, Isabel");
       
       
       UnidadTrabajo ut1 = new UnidadTrabajo("Interacción de objetos. Estructura de control iterativa", 25, 11, 2022, 55, 60, 10, 30);
       NotaEstudianteUnidad notaUt1 = new NotaEstudianteUnidad(ut1, 5.00, 6.00, 7.00);
       estudiante.registrarNotaUnidad(notaUt1);
       
       Fecha fecha2 = new Fecha(21, 9, 2022);
       PonderacionInstrumentos ponderacion2 = new PonderacionInstrumentos(70, 10, 20);
       UnidadTrabajo ut2 = new UnidadTrabajo("Objetos y clases", fecha2, 10, ponderacion2);
       NotaEstudianteUnidad notaUt2 = new NotaEstudianteUnidad(ut2, 6, 10, 7);
       estudiante.registrarNotaUnidad(notaUt2);
       
       Fecha fecha3 = new Fecha(16,10, 2022);
       PonderacionInstrumentos ponderacion3 = new PonderacionInstrumentos(65, 10, 25);
       UnidadTrabajo ut3 = new UnidadTrabajo("Definición deuna clase. Estructura condicional", fecha3, 35, ponderacion3);
       NotaEstudianteUnidad notaUt3 = new NotaEstudianteUnidad(ut3, 8, 6, 9);
       estudiante.registrarNotaUnidad(notaUt3);
       estudiante.print();
       
       
       
       
    }
}

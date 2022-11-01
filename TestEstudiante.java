/**
 * 
 * Clase que prueba el funcionamiento del programa
 * mediante un m�todo main que tambi�n sirve de
 * entrada a la aplicaci�n.
 * 
 * @author(Rub�n G�mez Garc�a)
 * 
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicaci�n
     */
    public static void main(String[] args) {
       //TODO
       Estudiante Isabel = new Estudiante("MOLINA HUARTE, Isabel");
       
       UnidadTrabajo UT3 = new UnidadTrabajo("Interacci�n de objetos. Estructura de control iterativa", 
       25, 10, 2022, 55, 60, 10, 30);
       
       NotaEstudianteUnidad notaUT3 = new NotaEstudianteUnidad(UT3, 5, 6, 7);
       Isabel.registrarNotaUnidad(notaUT3);
       
       System.out.println(Isabel);
       
       UnidadTrabajo UT1 = new UnidadTrabajo("Objetos y clases", 
       new Fecha(21, 9, 2022), 10, new PonderacionInstrumentos(70, 10, 20));
       
       NotaEstudianteUnidad notaUT1 = new NotaEstudianteUnidad(UT1, 6, 10, 7);
       Isabel.registrarNotaUnidad(notaUT1);
       
       UnidadTrabajo UT2 = new UnidadTrabajo("Definici�n de una clase. Estructura condicional", 
       new Fecha(16, 10, 2022), 35, new PonderacionInstrumentos(65, 10, 25));
       
       NotaEstudianteUnidad notaUT2 = new NotaEstudianteUnidad(UT2, 8, 6, 9);
       Isabel.registrarNotaUnidad(notaUT2);
       
       System.out.println(Isabel);
       
       System.out.println("\n\nCopia de la �ltima UT a�adida\n" + UT2.clonar());
    }
}

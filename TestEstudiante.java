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
       Estudiante isabel = new Estudiante("MOLINA HUARTE, Isabel");
       
       UnidadTrabajo ut3 = new UnidadTrabajo("Interacci�n de objetos. Estructura de control iterativa", 
       25, 10, 2022, 55, 60, 10, 30);
       
       NotaEstudianteUnidad notaUT3 = new NotaEstudianteUnidad(ut3, 5, 6, 7);
       isabel.registrarNotaUnidad(notaUT3);
       
       // System.out.println(isabel);
       
       UnidadTrabajo ut1 = new UnidadTrabajo("Objetos y clases", 
       new Fecha(21, 9, 2022), 10, new PonderacionInstrumentos(70, 10, 20));
       
       NotaEstudianteUnidad notaUt1 = new NotaEstudianteUnidad(ut1, 6, 10, 7);
       isabel.registrarNotaUnidad(notaUt1);
       
       UnidadTrabajo ut2 = new UnidadTrabajo("Definici�n de una clase. Estructura condicional", 
       new Fecha(16, 10, 2022), 35, new PonderacionInstrumentos(65, 10, 25));
       
       NotaEstudianteUnidad notaUt2 = new NotaEstudianteUnidad(ut2, 8, 6, 9);
       isabel.registrarNotaUnidad(notaUt2);
       
       System.out.println(isabel);
       
       ut2.setNombre("Copia de " + ut2.getNombre());
       System.out.println("\n\nCopia de la �ltima UT a�adida\n" + ut2.clonar());
    }
}

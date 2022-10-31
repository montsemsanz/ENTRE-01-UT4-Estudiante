/**
 * 
 * @author (Jagoba Inda)
 * 
 * Prueba del todas las clases
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicación
     */
    public static void main(String[] args) {
        Estudiante est = new Estudiante("MOLINA HUARTE, Isabel");
        
        UnidadTrabajo ut1 = new UnidadTrabajo("Interacción de objetos", 25, 11, 2022, 55, 60, 10, 30);
        NotaEstudianteUnidad notaUt1 = new NotaEstudianteUnidad(ut1, 5, 6, 7);
        est.registrarNotaUnidad(notaUt1);
        
        UnidadTrabajo ut2 = new UnidadTrabajo("Objetos y clases", 21, 9, 2022, 10, 70, 10, 20);
        NotaEstudianteUnidad notaUt2 = new NotaEstudianteUnidad(ut2, 6, 10, 7);
        est.registrarNotaUnidad(notaUt2);
        
        UnidadTrabajo ut3 = new UnidadTrabajo("Definición de una clase. Estructura condicional", 16, 10, 2022, 35, 65, 10, 25);
        NotaEstudianteUnidad notaUt3 = new NotaEstudianteUnidad(ut3, 8, 6, 9);
        est.registrarNotaUnidad(notaUt3);
        
        UnidadTrabajo clonUt3 = ut3.clonar(ut3);
        
        System.out.println(est.toString());
        System.out.println(clonUt3.toString());
    }
}

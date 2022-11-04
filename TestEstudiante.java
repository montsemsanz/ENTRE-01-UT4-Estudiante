/**
 * Test para probar las clases
 * @author (Joseba Trigo)
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicación
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("MOLINA HUARTE, Isabel");
        
        UnidadTrabajo unidad1 = new UnidadTrabajo("Interacción de objetos", 25, 11, 2022, 55, 
                60, 10, 30);
        NotaEstudianteUnidad nota1 = new NotaEstudianteUnidad(unidad1, 5, 6, 7);
        estudiante.registrarNotaUnidad(nota1);
        
        UnidadTrabajo unidad2 = new UnidadTrabajo ("Objetos y clases", 21, 9, 2022, 10, 70,
                10, 20);
        NotaEstudianteUnidad nota2 = new NotaEstudianteUnidad(unidad2, 6, 10, 7);
        estudiante.registrarNotaUnidad(nota2);
        
        UnidadTrabajo unidad3 = new UnidadTrabajo("Definicion de una clase. Estructura condicional",
                16, 10, 2022, 35, 65, 10, 25);
        NotaEstudianteUnidad nota3 = new NotaEstudianteUnidad(unidad3, 8, 6, 9);
        estudiante.registrarNotaUnidad(nota3);
        
        estudiante.print();
        System.out.println("=".repeat(80) + "\n\n");
        UnidadTrabajo clon = unidad3.clonar();
        System.out.println("Copia de la ultima UT añadida" + clon.toString());
    }

}

/**
 * Prueba del todas las clases
 * @author Aimar Urquizu Diego
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicación
     */
    public static void main(String[] args) {
        // El nuevo estudiante 
        Estudiante nombreEstudiante = new Estudiante("MOLINA HUARTE, Isabel");

        // UT1
        UnidadTrabajo newUT1 = new UnidadTrabajo
            ("Interacción de objetos. Estructura de control iterativa",
                25, 11, 2022, 55, 60, 10, 30); // Unidad de trabajo
        NotaEstudianteUnidad notaUT1 = new NotaEstudianteUnidad(newUT1,
                            5, 6, 7); // Objeto NotaEstudianteUnidad
                            
        // Registra la nota anterior en el estudiante
        nombreEstudiante.registrarNotaUnidad(notaUT1);
        
        // UT2
        UnidadTrabajo newUT2 = new UnidadTrabajo("Objetos y clases",
                        21, 9, 2022, 10, 70, 10, 20); // Unidad de trabajo
                        
        NotaEstudianteUnidad notaUT2 = new NotaEstudianteUnidad(newUT2,
                            6, 10, 7); // Objeto NotaEstudianteUnidad
                            
        // Registra la nota anterior en el estudiante
        nombreEstudiante.registrarNotaUnidad(notaUT2);
        
        // UT3
        UnidadTrabajo newUT3 = new UnidadTrabajo
                        ("Definición de una clase. Estructura condicional",
                        16, 10, 2022, 35, 65, 10, 25); // Unidad de trabajo UT3

        NotaEstudianteUnidad notaUT3 = new NotaEstudianteUnidad(newUT3,
                            8, 6, 9); // Objeto NotaEstudianteUnidad UT3
    
        // Registra la nota anterior en el estudiante
        nombreEstudiante.registrarNotaUnidad(notaUT3);
        
        // Clon de la ultima UT añadida y mostrarla en pantalla
        UnidadTrabajo clonUT = newUT3.clonar();
        
        // La informacion del estudiante en pantalla
        nombreEstudiante.print();
        
        clonUT.print();// Imprimir clon en pantalla
    }
}

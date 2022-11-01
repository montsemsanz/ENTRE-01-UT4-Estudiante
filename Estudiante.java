/**
 * Describe a un estudiante
 * Todo estudiante tiene un nombre
 * y guarda las 3 notas que ha sacado en cada una de las tres unidades de
 * trabajo que hay en la evaluación
 * @author (Aimar Urquizu Diego)
 */
public class Estudiante {
    private String nombre;
    private NotaEstudianteUnidad notaA;
    private NotaEstudianteUnidad notaB;
    private NotaEstudianteUnidad notaC;

    /**
     * Constructor
     * Inicializa el nombre del estudiante y el resto lo deja a null
     * Cuando se crea un estudiante inicialmente no tiene registrada ninguna
     * nota
     */
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notaA = null;
        this.notaB = null;
        this.notaC = null;
    }

    /**
     * Accesor para el nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Mutador para el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cantidad de notas registradas hasta el momento
     * (0, 1, 2 o 3)
     */
    public int totalNotas() {
        // devuelve el nº de notas registradas hasta el momento
        int totalNotas = 0;
        if (notaA == null) {
            totalNotas += 0;
        }
        else {
            totalNotas ++;
        }
        if (notaB == null) {
            totalNotas += 0;
        }
        else {
            totalNotas ++;
        }
        if (notaC == null) {
            totalNotas += 0;
        }
        else {
            totalNotas ++;
        }
        
        return totalNotas;
    }

    /**
     * registra un nuevo objeto nota, la nota asociada a una unidad
     * Los objetos se sitúan uno detrás de otro pero siempre han de quedar
     * las notas en orden de fecha de finalización de la UT asociada (de
     * menor a mayor)
     * 
     * Pista!! En este método se utilizará el método totalNotas()
     */
    public void registrarNotaUnidad(NotaEstudianteUnidad nota) {
        //TODO

    }

   
    /**
     * Calcula y devuelve la nota final obtenida por el estudiante en la
     * evaluación que dependerá de la ponderación de cada UT
     * El método devuelve -1 si al invocarlo no se han registrado los tres
     * objetos NotaEstudianteUnidad que se necesitan para calcular la nota final
     */
    public double calcularNotaFinalEstudiante() {
       double notaFinalEstudiante = 0;
       // Falta terminar, falta el peso de cada unidad
       if (notaA != null && notaB != null && notaC != null) {
            notaFinalEstudiante = notaA.calcularNotaUnidad() *  + 
                notaB.calcularNotaUnidad() + 
                notaC.calcularNotaUnidad();
       }
       else {
           notaFinalEstudiante = -1;
       }
       
       return notaFinalEstudiante;

    }

    /**
     * Representación textual del estudiante (ver enunciado)
     */
    public String toString() {
        String str2 = String.format("MOLINA HUARTE, Isabel\n" + "*".repeat(80) +
                    "\nNo es posible calcular su nota final de evaluación," +  
                    "faltan notas por registrar");
        
        return str2;
    }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

    

}

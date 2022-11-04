/**
 * Describe a un estudiante
 * Todo estudiante tiene un nombre
 * y guarda las 3 notas que ha sacado en cada una de las tres unidades de
 * trabajo que hay en la evaluaci�n
 * @author - Santi Lerga
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
        int notasRegistradas = 0;
        if (notaA != null){
            notasRegistradas++;
        }
        if (notaB != null){
            notasRegistradas++;
        }
        if (notaC != null){
            notasRegistradas++;
        }

        return notasRegistradas;
    }

    /**
     * registra un nuevo objeto nota, la nota asociada a una unidad
     * Los objetos se sit�an uno detr�s de otro pero siempre han de quedar
     * las notas en orden de fecha de finalizaci�n de la UT asociada (de
     * menor a mayor)
     * 
     * Pista!! En este m�todo se utilizar� el m�todo totalNotas()
     */
    public void registrarNotaUnidad(NotaEstudianteUnidad nota) {
       //TODO
    }

    /**
     * Calcula y devuelve la nota final obtenida por el estudiante en la
     * evaluaci�n que depender� de la ponderaci�n de cada UT
     * El m�todo devuelve -1 si al invocarlo no se han registrado los tres
     * objetos NotaEstudianteUnidad que se necesitan para calcular la nota final
     */
    public double calcularNotaFinalEstudiante() {
        double notA;
        double notB;
        double notC;
        if(totalNotas() != 3){
            return -1;
        }
        else {
            notA = (notaA.getUnidad().getPesoUnidad() * notaA.calcularNotaUnidad() / 100);
            notB = (notaB.getUnidad().getPesoUnidad() * notaB.calcularNotaUnidad() / 100);
            notC = (notaC.getUnidad().getPesoUnidad() * notaC.calcularNotaUnidad() / 100);
        }
        return notA + notB + notC;
    }

    /**
     * Representaci�n textual del estudiante (ver enunciado)
     */
    public String toString() {
        String str = "";
        str += nombre + "\n";
        str += "-".repeat(80) + "\n";
        if(calcularNotaFinalEstudiante() == -1){
            str += nombre + "\n" +
            "*".repeat(80) + "No es posible calcula su nota final de evaluacion, faltan notas por resgistras";
        }

        else {
            str += notaA.getUnidad().toString() + notaB.getUnidad().toString() + notaC.getUnidad().toString();
            str += ("Nota final de evaluacion: %6.2f" + calcularNotaFinalEstudiante() + "\n");
            str += "\n" + "=".repeat(80);

        }

        return str;

    }
    /**
     * Este m�todo se ha incluido solo para testear la clase m�s f�cilmente
     */
    public void print() {
        System.out.println(this.toString());

    }


}

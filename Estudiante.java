/**
 * Describe a un estudiante
 * Todo estudiante tiene un nombre
 * y guarda las 3 notas que ha sacado en cada una de las tres unidades de
 * trabajo que hay en la evaluaci�n
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
        int notasObtenidas = 0;
        if (notaA != null) {
            notasObtenidas++;
        }
        if (notaB != null) {
            notasObtenidas++;
        }
        if (notaC != null) {
            notasObtenidas++;
        }
        return notasObtenidas;
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
        if(totalNotas() == 0){
            notaA = nota;
        }
        else if (totalNotas() == 1){
            notaB = nota;
        }

    }

   
    /**
     * Calcula y devuelve la nota final obtenida por el estudiante en la
     * evaluaci�n que depender� de la ponderaci�n de cada UT
     * El m�todo devuelve -1 si al invocarlo no se han registrado los tres
     * objetos NotaEstudianteUnidad que se necesitan para calcular la nota final
     */
    public double calcularNotaFinalEstudiante() {
       double sinNotaA;
       double sinNotaB;
       double sinNotaC;
       
       if (totalNotas() != 3){
           return -1;
       }
       else {   
           return notaA.calcularNotaUnidad() * (notaA.getUnidad().getPesoUnidad()/100) + notaB.calcularNotaUnidad() * (notaB.getUnidad().getPesoUnidad()/100) + notaC.calcularNotaUnidad() * (notaC.getUnidad().getPesoUnidad()/100);
       }
    }

    /**
     * Representaci�n textual del estudiante (ver enunciado)
     */
    public String toString() {
       System.out.println(nombre);
       System.out.println("*".repeat(80));
       String str = "";
       if(calcularNotaFinalEstudiante() == -1){
           str = "No es posible calcular su nota final de evaluaci�n, faltan notas por registrar";
       }
       else{
           str += notaA.getUnidad().toString() + "\n";
           str += notaA.toString() + "\n";
           str += notaB.getUnidad().toString() + "\n";
           str += notaB.toString() + "\n";
           str += notaC.getUnidad().toString() + "\n";
           str += notaC.toString() + "\n";
           str += String.format("Nota final de evaluaci�n: %6.2f", calcularNotaFinalEstudiante()) + "\n";
           str += "=".repeat(80) + "\n";
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

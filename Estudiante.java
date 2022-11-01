/**
 * Describe a un estudiante
 * Todo estudiante tiene un nombre
 * y guarda las 3 notas que ha sacado en cada una de las tres unidades de
 * trabajo que hay en la evaluación
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
        int tmp = 0;
        if (notaA != null){
            tmp ++;
        }

        if (notaB != null){
            tmp ++;
        }

        if (notaC != null){
            tmp ++;
        }
        return tmp;        
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
        if(totalNotas() == 0){
            notaA = nota;
        }
        else if (totalNotas() == 1 ){
            notaB = nota;
            if (notaB.getUnidad().getFechaFin().antesQue(notaA.getUnidad().getFechaFin())){
                NotaEstudianteUnidad nota1 = notaA;
                notaA = notaB;
                notaB = nota1;
            }
        }
        else if (totalNotas() == 2){
            notaC = nota;
            if (notaC.getUnidad().getFechaFin().antesQue(notaB.getUnidad().getFechaFin())
            && notaC.getUnidad().getFechaFin().antesQue(notaA.getUnidad().getFechaFin())){
                NotaEstudianteUnidad nota1 = notaA;
                NotaEstudianteUnidad nota2 = notaB;
                notaA = notaC;
                notaB = nota1;
                notaC = nota2;
            }
            else if(notaC.getUnidad().getFechaFin().antesQue(notaB.getUnidad().getFechaFin())){
                NotaEstudianteUnidad nota1 = notaB;
                notaB = notaC;
                notaC = nota1;
            }
        }
        else {
            System.out.println("No puede añadirse una UT nueva, para cambiarla use otro método");
        }
    }

    /**
     * Calcula y devuelve la nota final obtenida por el estudiante en la
     * evaluación que dependerá de la ponderación de cada UT
     * El método devuelve -1 si al invocarlo no se han registrado los tres
     * objetos NotaEstudianteUnidad que se necesitan para calcular la nota final
     */
    public double calcularNotaFinalEstudiante() {
        if (totalNotas() != 3){
            return -1;
        }
        return (notaA.calcularNotaUnidad() * notaA.getUnidad().getPesoUnidad() / 100) + 
        (notaB.calcularNotaUnidad() * notaB.getUnidad().getPesoUnidad() / 100) +
        (notaC.calcularNotaUnidad() * notaC.getUnidad().getPesoUnidad() / 100);
    }

    /**
     * Representación textual del estudiante (ver enunciado)
     */
    public String toString() {
        String str = nombre + "\n" + "*".repeat(80) + "\n";
        if (totalNotas() != 3){
            str += "No es posible calcular su nota final de evaluación, faltan notas por registrar";
        }
        else{
            str += notaA.toString() + "\n\n" + notaB.toString() + "\n\n" + notaC.toString() +
            "\n\n";
            str += String.format("Nota final de evaluación: %4.2f", this.calcularNotaFinalEstudiante());
            str += "\n" + "=".repeat(80);
        }
        return str;
    }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

}

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
        int cantidadNotas = 0;

        if (notaA != null){
            cantidadNotas++;
        }

        if (notaB != null){
            cantidadNotas++;
        }

        if (notaB != null){
            cantidadNotas++;
        }

        return cantidadNotas;
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
       
        NotaEstudianteUnidad extra = notaA;
        NotaEstudianteUnidad extra2 = notaB;
        //pone la nota en la primera posición
           if (totalNotas() == 0) {
            notaA = nota;
        }
        //pone la nota en segunda posicion y la que estaba en la 2 en la primera
        else if (totalNotas() == 1) {
            notaB = nota;
            if (notaB.getUnidad().getFechaFin().antesQue(notaA.getUnidad().getFechaFin())) {
                notaA = notaB;
                notaB = extra;
            }
            
        }//pone la nota en tercera posicion y la que estaba en tercera en segunda o en primera
        else if (totalNotas() == 2) {
            notaC = nota;
            if (notaC.getUnidad().getFechaFin().antesQue(notaA.getUnidad().getFechaFin()) && notaC.getUnidad().getFechaFin().antesQue(notaB.getUnidad().getFechaFin())) {
                notaA = notaC;
                notaB = extra;
                notaC = extra2;
            }

            else if (notaC.getUnidad().getFechaFin().antesQue(notaB.getUnidad().getFechaFin())) {
                notaB = notaC;
                notaC = extra;
            }
        }
       

    }
    /**
     * Calcula y devuelve la nota final obtenida por el estudiante en la
     * evaluación que dependerá de la ponderación de cada UT
     * El método devuelve -1 si al invocarlo no se han registrado los tres
     * objetos NotaEstudianteUnidad que se necesitan para calcular la nota final
     */
    public double calcularNotaFinalEstudiante() {

        double notaFinalA = 0.0;
        double notaFinalB = 0.0;
        double notaFinalC = 0.0;
        double resultado = 0.0;
        if (totalNotas() == 3) {
            notaFinalA = notaA.getUnidad().getPesoUnidad() * notaA.calcularNotaUnidad() / 100;
            notaFinalB = notaB.getUnidad().getPesoUnidad() * notaA.calcularNotaUnidad() / 100;
            notaFinalC = notaC.getUnidad().getPesoUnidad() * notaA.calcularNotaUnidad() / 100;
            resultado = notaFinalA + notaFinalB + notaFinalC;
        }
        else {
            resultado = -1;
        }
        return resultado;
    }

    /**
     * Representación textual del estudiante (ver enunciado)
     */
    public String toString() {
        String string = "";

        // string = nombre + "/n" +
        // "*".repeat(80) + "\n" +
        // notaA.toString() + "\n" +
        // notaB.toString() + "\n" +
        // notaC.toString() + "\n";

        if (calcularNotaFinalEstudiante() == -1) {
            string = nombre + "/n" +
            "No es posible calcular su nota final de evaluación, faltan notas por registrar.\n" +
            "=".repeat(60) + "\n\n\n";
        }else {
            string = String.format("Nota final de evaluación: %4.2f\n", calcularNotaFinalEstudiante())+"/n" +
            "=".repeat(60) + "\n\n\n";
        }

        return string;
    }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

}

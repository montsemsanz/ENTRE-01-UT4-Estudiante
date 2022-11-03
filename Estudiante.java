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
        int notas = 0;
        if(notaA != null){
            notas++;
        }
        if(notaB != null){
            notas++;
        }
        if(notaC != null){
            notas++;
        }
        return notas;
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
        else if(totalNotas() == 1){
            if(notaA.getUnidad().getFechaFin().antesQue(nota.getUnidad().getFechaFin())){
                notaB = nota;
            }
            else{
                notaB = notaA;
                notaA = nota;
            }
        }
        else if(totalNotas() == 2){
            if(notaA.getUnidad().getFechaFin().antesQue(nota.getUnidad().getFechaFin())){
                if(notaB.getUnidad().getFechaFin().antesQue(nota.getUnidad().getFechaFin())){
                notaC = nota;
            }
            else{
                notaC = notaB;
                notaB = nota;
            }
            }
            else{
                notaC = notaB;
                notaB = notaA;
                notaA = nota;
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
       if(totalNotas() != 3){
           return -1;
       }
       else{
         return notaA.calcularNotaUnidad() * notaA.getUnidad().getPesoUnidad() + notaB.calcularNotaUnidad() * notaB.getUnidad().getPesoUnidad() + notaC.calcularNotaUnidad() * notaC.getUnidad().getPesoUnidad();
       }
    }

    /**
     * Representación textual del estudiante (ver enunciado)
     */
    public String toString() {
       System.out.println(nombre);
       System.out.println("*".repeat(80));
       if(calcularNotaFinalEstudiante() == -1){
           System.out.println("No es posible calcular su nota final de evaluación, faltan notas por registrar");
       }
       else{
           notaA.getUnidad().print();
           notaA.print();
           notaB.getUnidad().print();
           notaB.print();
           notaC.getUnidad().print();
           notaC.print();
           System.out.println("Nota final de evaluación: " + calcularNotaFinalEstudiante());
           System.out.println("=".repeat(62));
           System.out.println("Copia de la última UT añadida");
           
       }
       return null;
    }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

    

}

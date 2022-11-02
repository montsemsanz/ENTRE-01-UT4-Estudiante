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
        int totalNotas = 0;
        
        if(notaA == null){ //totalNotas=0
            totalNotas = 0;
        }
        
        else if(notaB == null){ //totalNotas=1
            totalNotas = 1;
        }
        
        else if (notaC == null){ //totalNotas=2
            totalNotas = 2;                
        }
        else{
            totalNotas = 3;
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
        if(totalNotas()==0){
            this.notaA = nota;
        }
        else if(totalNotas()==1){
            this.notaB = nota;
        }   
        else if(totalNotas()==2){
            this.notaC = nota;
        }
    }

    /**
     * Calcula y devuelve la nota final obtenida por el estudiante en la
     * evaluación que dependerá de la ponderación de cada UT
     * El método devuelve -1 si al invocarlo no se han registrado los tres
     * objetos NotaEstudianteUnidad que se necesitan para calcular la nota final
     */
    public double calcularNotaFinalEstudiante() {
        double A = notaA.calcularNotaUnidad() * notaA.getUnidad().getPesoUnidad();
        
        double B = notaB.calcularNotaUnidad() * notaB.getUnidad().getPesoUnidad();
        
        double C = notaC.calcularNotaUnidad() * notaC.getUnidad().getPesoUnidad();
         //le doy sus notas respectivas a la UT (1 2 Y 3
        
        double notaFinal = 0;
        
        // if(totalNotas()== 0){
             // A = notaA.calcularNotaUnidad() * notaA.getUnidad().getPesoUnidad();
        // }
        // else if((totalNotas()== 1)){
             // B = notaB.calcularNotaUnidad() * notaB.getUnidad().getPesoUnidad();
        // }
        // else if(totalNotas()== 2){
             // C = notaC.calcularNotaUnidad() * notaC.getUnidad().getPesoUnidad();
        // } ¡¡¡¡ "Este If sobra con definirlo al crear la variable va bien"¡¡¡¡
        
        if(totalNotas()==3){
            notaFinal = ((A+B+C)/10); //divides entre 10 para que salga en formato maximo 10 y no 100. 
        }
        else{
            notaFinal = -1;
        }
        //solo calculo la notaFinal si las 3 UT tienen nota, caso contrario -1.
        
        return notaFinal;
    }

    // /**
     // * Representación textual del estudiante (ver enunciado)
     // */
    // // public String toString() {
        // // String str = "";
        
        // // str += notaA.toString(); //da igual que sea notaA solo quiero usarlo para llamar al metodo toString de N.E.U
        
        
        // // return null;
    // }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

}

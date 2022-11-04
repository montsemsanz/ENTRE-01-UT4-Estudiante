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
        double A = notaA.calcularNotaUnidad() * notaA.getUnidad().getPesoUnidad() /10; //Rebajar la ponderacion de 100 a 10
        
        double B = notaB.calcularNotaUnidad() * notaB.getUnidad().getPesoUnidad() /10;
        
        double C = notaC.calcularNotaUnidad() * notaC.getUnidad().getPesoUnidad() /10;
         //le doy sus notas respectivas a la UT (1 2 Y 3)
        double notaFinal = 0;
        
        if(totalNotas()==3){
            notaFinal = ((A+B+C)/10); //divides entre 10 para que salga en formato maximo 10 y no 100. 
        }
        else{
            notaFinal = -1;
        }
        //solo calculo la notaFinal si las 3 UT tienen nota, caso contrario -1.
        
        return notaFinal;
    }

    /**
     * Representación textual del estudiante (ver enunciado)
     */
    public String toString() {
        if(totalNotas()!= 3){ //el 40 es un ancho dado a lo random      
            String str = String.format("%-40s\n" + "*".repeat(80) +  "\n%-40s" , nombre, "No es posible calcular su nota final de evaluación, faltan notas por registar");
            return str;
        }
        
        //Aqui solo debo añadir el nombre del estudiante, lo demas del print viene
        //en el toString de NotaEstudianteUnidad... obtenido objetos nota A B y C para cada UT
        
        String str = String.format("%-40s\n" + "*".repeat(80) , nombre); //Saca el nombreEstudiante
        
        String str2 = String.format("\nNota final de evaluacion: %3.2f\n", calcularNotaFinalEstudiante());
        
        String str3 = String.format("\nCopia de la ultima UT añadida: %-40s\n" , notaA.getUnidad().clonar().toString()); //Estoy intentando llegar al toString de la clase UT
        
        
        return str + "\n" + notaA.toString() + "\n" + notaB.toString() + "\n"+ notaC.toString() 
         + str2 + "=".repeat(80) + str3; //str2 es para el bloque de nota final y el str3 para la copia creada antes
        
    }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

}

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
        int nota = 0;
        if (notaA != null) {
            nota++;
        }
        
        if (notaB != null) {
            nota++;
        }
        
        if (notaC != null) {
            nota++;
        }

        return nota;
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
        switch (this.totalNotas()) {
            case 0:
                this.notaA = nota;
                break;
            case 1:
                if (nota.getUnidad().getFechaFin().antesQue(notaA.getUnidad().getFechaFin())) {
                    notaB = notaA;
                    notaA = nota;
                }   break;
            default:
                if (nota.getUnidad().getFechaFin().antesQue(notaB.getUnidad().getFechaFin())) {
                    if (nota.getUnidad().getFechaFin().antesQue(notaA.getUnidad().getFechaFin())) {
                        notaC = notaB;
                        notaB = notaA;
                        notaA = nota;
                    } else {
                        notaC = notaB;
                        notaB = nota;
                    }
                } else {
                    notaC = nota;
                }   break;
        }
    }

   
    /**
     * Calcula y devuelve la nota final obtenida por el estudiante en la
     * evaluación que dependerá de la ponderación de cada UT
     * El método devuelve -1 si al invocarlo no se han registrado los tres
     * objetos NotaEstudianteUnidad que se necesitan para calcular la nota final
     */
    public double calcularNotaFinalEstudiante() {
        double nota = 0;
        if (notaA != null) {
            nota += notaA.calcularNotaUnidad() * notaA.getUnidad().getPesoUnidad();
        }else {
            return -1;
        }
        if (notaB != null) {
            nota += notaB.calcularNotaUnidad() * notaB.getUnidad().getPesoUnidad();
        }else {
            return -1;
        }
        if (notaC != null) {
            nota += notaC.calcularNotaUnidad() * notaC.getUnidad().getPesoUnidad();
        }else {
            return -1;
        }
        nota = nota / 100;
        return nota;

    }

    /**
     * Representación textual del estudiante (ver enunciado)
     */
    public String toString() {
        String str;
        double nota = this.calcularNotaFinalEstudiante();
        str = this.nombre;
        System.out.println("***");
        this.notaA.getUnidad().print();
        this.notaA.print();
        System.out.println("---------------------------------------------------------------");
        this.notaB.getUnidad().print();
        this.notaB.print();
        System.out.println("---------------------------------------------------------------");
        this.notaC.getUnidad().print();
        this.notaC.print();
        System.out.println("---------------------------------------------------------------");
        if (nota == -1){
            str += "No es posible calcular su nota final de evaluación, faltan notas por registrar";
        }else {
            str += "Nota final de evaluación: "+ nota;
        }
        System.out.println("================================================================");
        return str;
    }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

    

}

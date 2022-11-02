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
        int total = 0;
        
        if (notaA != null) {
            total++;
        }
        
        if (notaB != null) {
            total++;
        }
        
        if (notaC != null) {
            total++;
        }

        return total;
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
        if (totalNotas() == 1) {
            notaA = nota;
        }
        
        else if (totalNotas() == 2) {
            UnidadTrabajo unidadA = notaA.getUnidad();
            UnidadTrabajo unidadNota = nota.getUnidad();
            Fecha fechaA = unidadA.getFechaFin();
            Fecha fechaNota = unidadNota.getFechaFin();
            
            if (notaA == null) {
                notaA = nota;
            }
            else if (fechaA.antesQue(fechaNota)) {
                notaB = nota;
            }
            else {
                notaB = notaA;
                notaA = nota;
            }
        }
        
        else {
            if (notaA == null) {
                notaA = nota;
            }
            else if (notaB == null) {
                UnidadTrabajo unidadA = notaA.getUnidad();
                UnidadTrabajo unidadNota = nota.getUnidad();
                Fecha fechaA = unidadA.getFechaFin();
                Fecha fechaNota = unidadNota.getFechaFin();
                
                if (fechaA.antesQue(fechaNota)) {
                    notaB = nota;
                }
                else {
                    notaB = notaA;
                    notaA = nota;
                }
            }
            else {
                UnidadTrabajo unidadA = notaA.getUnidad();
                UnidadTrabajo unidadB = notaB.getUnidad();
                UnidadTrabajo unidadNota = nota.getUnidad();
                Fecha fechaA = unidadA.getFechaFin();
                Fecha fechaB = unidadB.getFechaFin();
                Fecha fechaNota = unidadNota.getFechaFin();
                
                if (fechaNota.antesQue(fechaA)) {
                    notaC = notaB;
                    notaB = notaA;
                    notaA = nota;
                }
                else if (fechaNota.antesQue(fechaB)) {
                    notaC = notaB;
                    notaB = nota;
                }
                else {
                    notaC = nota;
                }
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
        if (totalNotas() != 3) {
            return -1;
        }
        else {
            UnidadTrabajo unidadA = notaA.getUnidad();
            UnidadTrabajo unidadB = notaB.getUnidad();
            UnidadTrabajo unidadC = notaC.getUnidad();
           
            return notaA.calcularNotaUnidad() * unidadA.getPesoUnidad() / 100 +
                   notaB.calcularNotaUnidad() * unidadB.getPesoUnidad() / 100 +
                   notaC.calcularNotaUnidad() * unidadC.getPesoUnidad() / 100; 
        }
    }
    
    /**
     * Representación textual del estudiante (ver enunciado)
     */
    public String toString() {
        String str = String.format(nombre + "\n" + "*".repeat(80));
        if (totalNotas() != 3) {
            str += "\nNo es posible calcular su nota final de evaluación, faltan notas por registrar";
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

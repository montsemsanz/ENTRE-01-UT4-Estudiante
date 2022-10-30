/**
 * @author - Almudena Iparraguirre
 * Un objeto de esta clase está asociado con una unidad de trabajo
 * y guarda la nota que un estudiante ha sacado en los controles, actividades y
 * proyectos de esa unidad
 */
public class NotaEstudianteUnidad {
    private UnidadTrabajo unidad;
    private double notaControles;
    private double notaActividades;
    private double notaProyectos;
    
    /**
     * Constructor
     */
    public NotaEstudianteUnidad(UnidadTrabajo unidad, double notaControles,
                                double notaActividades,
                                double notaProyectos) {
        this.unidad = unidad;
        this.notaControles = notaControles;
        this.notaActividades = notaActividades;
        this.notaProyectos = notaProyectos;
    }

    /**
     * Accesor para la UT
     */
    public UnidadTrabajo getUnidad() {
        return unidad;
    }

    /**
     * Accesor para la UT
     */
    public void setUnidad(UnidadTrabajo unidad) {
        this.unidad = unidad;
    }

    /**
     * Accesor para nota controles
     */
    public double getNotaControles() {
        return notaControles;
    }

    /**
     * Mutador para nota controles
     */
    public void setNotaControles(double notaControles) {
        this.notaControles = notaControles;
    }

    /**
     * Accesor para nota actividades
     */
    public double getNotaActividades() {
        return notaActividades;
    }

    /**
     * Mutador para nota actividades
     */
    public void setNotaActividades(double notaActividades) {
        this.notaActividades = notaActividades;
    }

    /**
     * Accesor para nota proyectos
     */
    public double getNotaProyectos() {
        return notaProyectos;
    }

    /**
     * Mutador para nota proyectos
     */
    public void setNotaProyectos(double notaProyectos) {
        this.notaProyectos = notaProyectos;
    }

    /**
     * Calcula y devuelve la nota obtenida en la UT teniendo
     * en cuenta la ponderación de los instrumentos de evaluación
     */
    public double calcularNotaUnidad() {
        double notaPondControl;
        double notaPondActividades;
        double notaPondProyecto;
        double notaTotal;
         
        notaPondControl = notaControles / 100 * unidad.getPonderacion().getControles();
        notaPondActividades =  notaActividades / 100 * unidad.getPonderacion().getActividades();
        notaPondProyecto = notaProyectos / 100 * unidad.getPonderacion().getProyectos();
         
        notaTotal = notaPondControl + notaPondActividades + notaPondProyecto;
         
        return notaTotal;
    }

        /**
     * Representación textual del objeto (ver enunciado)
     */
    public String toString() {
        String lineaFormateada = String.format("Controles:%6.2f \n Actividades clase:%6.2f \n Proyectos:%6.2f\n Nota final obtenidad en Unidad de Trabajo:%6.2f"
        ,notaControles, notaActividades,notaProyectos, calcularNotaUnidad(), "-".repeat(80) );
        System.out.println(lineaFormateada);
        return lineaFormateada;        
    }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }
}

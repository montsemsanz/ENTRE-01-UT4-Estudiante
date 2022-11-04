/**
 * Un objeto de esta clase está asociado con una unidad de trabajo
 * y guarda la nota que un estudiante ha sacado en los controles, actividades y
 * proyectos de esa unidad
 * @author - Aitor Cuadrado
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
    double notaActividades,double notaProyectos) {
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
        PonderacionInstrumentos ponderar = unidad.getPonderacion();
        double controlesPonderados = (notaControles * ponderar.getControles()) / 100;
        double actividadesPonderadas = (notaActividades * ponderar.getActividades()) / 100;
        double proyectosPonderados = (notaProyectos * ponderar.getProyectos()) / 100;
        double notaUnidad = controlesPonderados + actividadesPonderadas + proyectosPonderados;
        return notaUnidad;
    }

    /**
     * Representación textual del objeto (ver enunciado)
     */
    public String toString() {
        return unidad.toString() + ("Controles: " + getNotaControles()) + 
        "   Actividades: " + getNotaActividades() + "   Proyectos: " +
        getNotaProyectos() + "\nNota final obtenida en Unidad de Trabajo: " + 
        Math.round(calcularNotaUnidad()) + "\n" + "-".repeat(80);
    }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

}

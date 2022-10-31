/**
 * Un objeto de esta clase está asociado con una unidad de trabajo
 * y guarda la nota que un estudiante ha sacado en los controles, actividades y
 * proyectos de esa unidad
 */
public class NotaEstudianteUnidad {
    private UnidadTrabajo unidad; //ATR "unidad" TD Clase UT
    private double notaControles;
    private double notaActividades;
    private double notaProyectos;

    //estos 3 ATR relacionados a Clase Ponderacion, se llega objeto UT "ponderacion"

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
    //aki lo ya dado

    /**
     * Calcula y devuelve la nota obtenida en la UT teniendo
     * en cuenta la ponderación de los instrumentos de evaluación
     */
    public double calcularNotaUnidad() {

        // UnidadTrabajo nota_controles =  unidad.getControles();
        //tengo que obtener el int de getControles en PInst

        int ponderacionControles = (unidad.getPonderacion().getControles())/10;

        int ponderacionActividades = (unidad.getPonderacion().getActividades())/10;

        int ponderacionProyectos = (unidad.getPonderacion().getProyectos())/10;

        return ((notaControles * ponderacionControles + 
            notaActividades * ponderacionActividades + notaProyectos * ponderacionProyectos)/10);

    }

    /**
     * Representación textual del objeto (ver enunciado)
     */
    public String toString() {
        String str = unidad.toString(); //llamamos el metodo toString de la Clase UT

        str += System.out.printf("Controles: %3.2f", getNotaControles());

        str += System.out.printf("Actividades clase: %4.2f", getNotaActividades());

        str += System.out.printf("Proyectos: %3.2f", this.getNotaProyectos());

        return str;
    }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

}

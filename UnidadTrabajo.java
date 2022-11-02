/**
 * Un objeto de esta clase guarda informaci�n de una unidad
 * de trabajo
 * Toda UT adem�s del nombre,  fecha de finalizaci�n,
 * y peso en la evaluaci�n tiene asociado un objeto ponderaci�n
 * que incluye las ponderaciones usadas para cada instrumento de evaluaci�n
 * @author - Santi Lerga
 */
public class UnidadTrabajo {
    private String nombre;
    private Fecha fechaFin;
    private int pesoUnidad;
    private PonderacionInstrumentos ponderacion;

    /**
     * Constructor 1
     */
    public UnidadTrabajo(String nombre, int dia, int mes, int year, int peso,
    int controles, int actividades, int proyectos) {
        this.nombre = nombre;
        fechaFin = new Fecha (dia, mes, year);
        pesoUnidad = peso;
        ponderacion = new PonderacionInstrumentos (controles, actividades, proyectos);

    }
    /**
     * Constructor 2
     */
    public UnidadTrabajo(String nombre, Fecha fechaFin, int peso,
    PonderacionInstrumentos ponderacion) {
        this.nombre = nombre;
        this.fechaFin = fechaFin;
        this.pesoUnidad = peso;
        this.ponderacion = ponderacion;
    }

    /**
     * Accesor nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Mutador nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Accesor fecha de fin de UT
     */
    public Fecha getFechaFin() {
        return fechaFin;
    }

    /**
     * Mutador fecha de fin de UT
     */
    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Accesor peso de la UT en la evaluaci�n
     */
    public double getPesoUnidad() {
        return this.pesoUnidad;
    }

    /**
     * Accesor para el peso de la UT
     */
    public void setPesoUnidad(int pesoUnidad) {
        this.pesoUnidad = pesoUnidad;
    }

    /**
     * Accesor ponderaci�n
     */
    public PonderacionInstrumentos getPonderacion() {
        return ponderacion;
    }

    /**
     * Mutador ponderaci�n
     */
    public void setPonderacion(PonderacionInstrumentos ponderacion) {
        this.ponderacion = ponderacion;
    }

    /**
     * Devuelve true si la UT actual ha finalizado antes
     * que la recibida como par�metro
     */
    public boolean anteriorA(UnidadTrabajo unidad) {
        boolean anterior = this.getFechaFin().antesQue(unidad.getFechaFin());
        return anterior;
        
    }

    /**
     * Devuelve una copia (clon) de la unidad de trabajo actual con el nombre
     * "Copia de " + nombre de la UT actual
     * Se clonan tambi�n los objetos que incluya
     */
    public UnidadTrabajo clonar(UnidadTrabajo queUnidad) {
        UnidadTrabajo unClon = queUnidad;
        unClon.setNombre("Copia de " + unClon.getNombre());
        return unClon;
    }

    /**
     * Representaci�n textual de la UT
     */
    public String toString() {
        String str = "Unidad de trabajo - " + this.nombre +
            "\n\tFecha finalizaci�n: " + this.getFechaFin().toString() +
            " | Peso UT: " + this.pesoUnidad + "%\n";
        str += this.ponderacion;
        return str;
    }

    /**
     * Este m�todo se ha incluido solo para testear la clase m�s f�cilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

     
}

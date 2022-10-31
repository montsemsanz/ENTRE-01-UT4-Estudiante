/**
 * Un objeto de esta clase guarda información de una unidad
 * de trabajo
 * Toda UT además del nombre,  fecha de finalización,
 * y peso en la evaluación tiene asociado un objeto ponderación
 * que incluye las ponderaciones usadas para cada instrumento de evaluación
 */
public class UnidadTrabajo {
    private String nombre;
    private Fecha fechaFin; //atributo con TD la Clase Fecha
    private int pesoUnidad;
    private PonderacionInstrumentos ponderacion; //atributo con TD la Clase Ponderacion..

    /**
     * Constructor 1
     */
    public UnidadTrabajo(String nombre, int dia, int mes, int year, int peso,
    int controles, int actividades, int proyectos) {
        this.nombre = nombre;
        this.fechaFin = new Fecha(dia,mes,year); //referencia a un metodo de la clase Fecga
        this.pesoUnidad = peso;
        this.ponderacion = new PonderacionInstrumentos(controles, actividades, proyectos);
        //ATR tenga TipoDato una Clase(Server), para definir sus valores 
        //creo el objeto-(¿metódo?) que necesite y pongo (si hay) los PARAM de la Clase Cliente

    }

    /**
     * Constructor 2
     */
    public UnidadTrabajo(String nombre, Fecha fechaFin, int peso,
    PonderacionInstrumentos ponderacion) {
        this.nombre = nombre;
        this.fechaFin = fechaFin; //ATB fechaFin = Param de TD (Fecha) fechaFin
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
     * Accesor peso de la UT en la evaluación
     */
    public int getPesoUnidad() { //le cambie double por int (revertir)
        return this.pesoUnidad;
    }

    /**
     * Accesor para el peso de la UT
     */
    public void setPesoUnidad(int pesoUnidad) {
        this.pesoUnidad = pesoUnidad;
    }

    /**
     * Accesor ponderación
     */
    public PonderacionInstrumentos getPonderacion() {
        return ponderacion;
    }

    /**
     * Mutador ponderación
     */
    public void setPonderacion(PonderacionInstrumentos ponderacion) {
        this.ponderacion = ponderacion;
    }

    /**
     * Devuelve true si la UT actual ha finalizado antes
     * que la recibida como parámetro
     */
    public boolean anteriorA(UnidadTrabajo unidad) { //Que comparar dos objetos unidad su fecha
        UnidadTrabajo unidadNueva =  // Crear variable con TDato UT, 
        new UnidadTrabajo(unidad.getNombre() , unidad.getFechaFin() , unidad.getPesoUnidad() , //creo objeto UT y 
                                                                                                //le asigno sus valores 
                                                                                                //van a ser (los que tenga el objeto UT creado por usuario)
                unidad.getPonderacion());

        Fecha fechaUTNueva = unidad.getFechaFin(); //hago variable local separando el dato de la fecha del nuevo objeto "unidad" del resto

        return (this.fechaFin.antesQue(fechaUTNueva)); //utilizo el met de la Clasae fecha "antesQue()" llamandolo con el ATB fecha de este objeto UT y lo comparo
                                                        //en forma de PARAM con el objeto unidadNueva, como el met "antesQue()" es booleano lo que salga de ahi
                                                        // me devuelve aqui ya sea T o F. (Es decir la evaluacion se hace en el otro met)// return true;
    }

    /**
     * Devuelve una copia (clon) de la unidad de trabajo actual con el nombre
     * "Copia de " + nombre de la UT actual
     * Se clonan también los objetos que incluya
     */
    public UnidadTrabajo clonar() {
        //TODO

        return null;
    }

    /**
     * Representación textual de la UT
     */
    public String toString() {
        String str = "Unidad de trabajo - " + this.nombre +
            "\n\tFecha finalización: " + this.getFechaFin().toString() +
            " | Peso UT: " + this.pesoUnidad + "%\n";
        str += this.ponderacion;
        return str;
    }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

}

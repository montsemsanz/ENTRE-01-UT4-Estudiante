/**
 * Un objeto de esta clase almacena la ponderaci�n que tiene
 * cada instrumento de evaluaci�n (los controles, las actividades
 * y los proyectos)
 * @author - Santi Lerga
 */
public class PonderacionInstrumentos {
    private int controles;
    private int actividades;
    private int proyectos;

    /**
     * Constructor  
     */
    public PonderacionInstrumentos(int controles, int actividades,
                                   int proyectos) {
        this.controles = controles;
        this.actividades = actividades;
        this.proyectos = proyectos;
    }

    /**
     * Accesor ponderaci�n controles
     */
    public int getControles() {
        return controles;
    }

    /**
     * Mutador ponderaci�n controles
     */
    public void setControles(int controles) {
        this.controles = controles;
    }

    /**
     * Accesor ponderaci�n actividades
     */
    public int getActividades() {
        return actividades;
    }

    /**
     * Mutador ponderaci�n actividades
     */
    public void setActividades(int actividades) {
        this.actividades = actividades;
    }

    /**
     * Accesor ponderaci�n protectos
     */
    public int getProyectos() {
        return proyectos;
    }

    /**
     * Mutador ponderaci�n protectos
     */
    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

    /**
     * Representaci�n textual del objeto
     */
    public String toString() {
        return "Ponderacion Instrumentos Evaluaci�n" +
                "\n\tControles = " + controles + "%" +
                "\n\tActividades = " + actividades + "%" +
                "\n\tProyectos = " + proyectos + "%\n\n";
    }

    /**
     * Este m�todo se ha incluido solo para testear la clase m�s f�cilmente
     */
    public void print() {
        System.out.println(this.toString());

    }
}
/**
 * @ Midgard
 * Prueba del todas las clases
 */
public class TestEstudiante {
    //sin atributos
    /**
     * Punto de entrada a la aplicación
     */
    public static void main(String[] args) {
        // Persona persona = new Persona (nombre, edad, sueldo, estadoCivil);
        //Clase nombreObjetoCrea = new Clase (valores del constructor...);

        Estudiante estudiante = new Estudiante("MOLINA HUARTE, Isabel");
        //Nombre estudiante solo defino una vez-------------------------------------------
        UnidadTrabajo primeraUT = new UnidadTrabajo("Interacción de objetos. Estructura de control iterativa"
            , 25,11,2022, 55, 60, 10, 30);

        NotaEstudianteUnidad notaEs1 = new NotaEstudianteUnidad(primeraUT, 5, 6, 7);

        estudiante.registrarNotaUnidad(notaEs1); //registro nota con metodo clase Estudiante

        //Primera  UT/pero es la UT2---con Constructor uno-------------------------
        Fecha fechaFin2 = new Fecha (21,9,2022); //creo el objeto que me pide como Param el segundo constructor de TD Fecha. 
        PonderacionInstrumentos ponderacion2 = new PonderacionInstrumentos(70,10,20); //Le doy valores que me pide el Constructor de Clase (PonderacionInst..) y (Fecha)

        UnidadTrabajo segundaUT = new UnidadTrabajo("Objetos y clases", fechaFin2, 10, ponderacion2);

        NotaEstudianteUnidad notaEs2 = new NotaEstudianteUnidad(segundaUT,6,10,7);

        estudiante.registrarNotaUnidad(notaEs2); 
        //Segunda UT/pero es la UT1--- con Constructor dos--------------------------
        Fecha fechaFin3 = new Fecha (16,10,2022); 
        PonderacionInstrumentos ponderacion3 = new PonderacionInstrumentos(65,10,25); 

        UnidadTrabajo terceraUT = new UnidadTrabajo("Definicion de una clase",fechaFin3, 
                35, ponderacion3);

        NotaEstudianteUnidad notaEs3 = new NotaEstudianteUnidad(terceraUT,8,6,9);
        
        estudiante.registrarNotaUnidad(notaEs3); 
        
        estudiante.print();

       
    }
}

/**
 * 
 * @author - Cristina López Lusarreta
 * 
 * Prueba del todas las clases
 */
public class TestEstudiante {

    /**
     * Punto de entrada a la aplicación
     */
    public static void main(String[] args) {
        
     
        //---------CREAMOS EL ESTUDIANTE-----------------------------------------------------
        
            String nombreEstudiante = "MOLINA HUARTE, Isabel";
            
        Estudiante estudiante = new Estudiante(nombreEstudiante);
        
        
        //-------CREAMOS LA UNIDAD DE TRABAJO 1-----------------------------------------------        
    
        //- - - datos de UnidadTrabajo: - - - - - - - - - - - - - - - - - - - - - -
  
            String nombreUT = "Interaccion de objetos. Estructura de control iterativa";
            int dia = 25;
            int mes = 11;
            int año = 2022;
            int peso = 55;
            int ponderaControles = 60;
            int ponderaActividades = 10;
            int ponderaProyectos = 30;
            
        //- - - datos de NotaEstudianteUnidad: - - - - - - - - - - - - - - - - - -     
        
            double notaControles = 5;
            double notaActividades = 6;
            double notaProyectos = 7;
            
        //- - - creamos ambos objetos (UT y notas) - - - - - - - - - - - - - - - - - -  
        //Estudiante estudiante = new Estudiante(nombreEstudiante);
        
        UnidadTrabajo unidadTrabajo1 = new UnidadTrabajo(nombreUT, dia, mes, año, peso,
                                         ponderaControles, ponderaActividades, ponderaProyectos);
                                         
        NotaEstudianteUnidad notasEstudianteUT1 = new NotaEstudianteUnidad(unidadTrabajo1, 
                                            notaControles, notaActividades, notaProyectos);
                                            
        // NotaEstudianteUnidad notasEstudianteUT2 = new NotaEstudianteUnidad(unidadTrabajo1, 
                                            // notaControles, notaActividades, notaProyectos);
                                            
        // NotaEstudianteUnidad notasEstudianteUT3 = new NotaEstudianteUnidad(unidadTrabajo1, 
                                            // notaControles, notaActividades, notaProyectos);
                                            
        //- - - registramos las notas de esta UT - - - - - - - - - - - - - - - - - -                                   
        notasEstudianteUT1.setNotaControles(notaControles); 
        notasEstudianteUT1.setNotaActividades(notaActividades); 
        notasEstudianteUT1.setNotaProyectos(notaProyectos);
        
        double notaUnidad = notasEstudianteUT1.calcularNotaUnidad();
        estudiante.registrarNotaUnidad(notasEstudianteUT1);
        
        //- - - Mostrar en pantalla toda la información del alumno - - - - - - - - - - - - - - - - - -  
        System.out.println("=".repeat(100));
        estudiante.print();
        notasEstudianteUT1.print();
        
        
        
                    
        
        
        //-------HACEMOS UNA COPIA DE UT3 -----------------------------------------------  
        // UnidadTrabajo copiaUT3 = unidadTrabajo3.clonar();
        // copiaUT3.print();
        
    
    
    
    }
}

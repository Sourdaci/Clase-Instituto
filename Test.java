import java.util.ArrayList;
/**
 * Prueba de la clase Alumno
 * 
 * @author Sourdaci
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private ArrayList<Alumno> alumnos;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
    }

    public void pruebaClaseAlumno(){
        alumnos = new ArrayList<Alumno>();
        alumnos.add(new Alumno("Paco", 16, 6));
        alumnos.add(new Alumno("Pepe", 17, 2));
        alumnos.add(new Alumno("Paula", 18, 9));
        alumnos.add(new Alumno("Pepa", 15, -4));
        alumnos.add(new Alumno("Fausto", 16, 3));
        for(Alumno estudiante : alumnos){
            estudiante.muestraDatos();
            System.out.println("Nota media = " + estudiante.mediaNotas());
            if(estudiante.estarAprobado(estudiante.mediaNotas())){
                System.out.println("Esta aprobado");
            }else{
                System.out.println("Ha suspendido");
            }
        }
    }
}

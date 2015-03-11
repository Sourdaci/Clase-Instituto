import java.util.Random;
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
        alumnos.add(new Alumno("Paco", 16));
        alumnos.add(new Alumno("Pepe", 17));
        alumnos.add(new Alumno("Paula", 18));
        alumnos.add(new Alumno("Pepa", 15));
        alumnos.add(new Alumno("Fausto", 16));
        Random aleatorio = new Random();
        for (int i = 0; i < alumnos.size(); i++){
            int cantidad = aleatorio.nextInt(8) + 1;
            for (int num = 0; num < cantidad; num++){
                alumnos.get(i).calificarAlumno(aleatorio.nextInt(10) + 1);
            }
        }
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

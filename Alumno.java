import java.util.ArrayList;
/**
 * Datos basicos de un alumno del centro
 * 
 * @author Sourdaci
 * @version 2015-03-09 01
 */
public class Alumno
{
    // instance variables - replace the example below with your own
    private static int numeroClase = 1;
    private int numClaseAlumno;
    private String nombre;
    private int edad;
    private ArrayList<Integer> notas;
    private static final int MINIMO_MEDIA = 5;

    /**
     * Inicializacion de ficha del alumno
     * 
     * @param nombre El nombre del alumno
     * @param edad La edad del alumno
     * @param cantidadNotas El numero de asignaturas a evaluar. Si es erroneo se evaluaran 7
     */
    public Alumno(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        numClaseAlumno = numeroClase;
        numeroClase++;
        notas = new ArrayList<Integer>();
    }
    
    /**
     * Agrega al alumno una nota de una asignatura
     * 
     * @param nota La nota de la asignatura para calcular la media
     */
    public void calificarAlumno(int nota){
        notas.add(nota);
    }
    
    /**
     * Calcula la media de notas del alumno
     * 
     * @return La nota media del alumno
     */
    public float mediaNotas(){
        float media = 0;
        int cantidadNotas = notas.size();
        for (int i = 0; i < cantidadNotas; i++){
            media += notas.get(i);
        }
        media = media / cantidadNotas;
        return media;
    }
    
    /**
     * Indica si el alumno puede aprobar o no con la nota media que tiene
     * 
     * @param media La nota media del alumno
     * 
     * @return true si el alumno aprueba, false si suspende
     */
    public boolean estarAprobado(float media){
        return (mediaNotas() >= MINIMO_MEDIA);
    }
    
    public void muestraDatos(){
        System.out.println("Nombre: " + nombre + ", edad: " + edad);
        System.out.println("Numero de clase: " + numClaseAlumno);
        System.out.print("Notas:");
        for (int nota : notas){
            System.out.print(" " + nota);
        }
        System.out.print("\n");
    }
}

import java.util.Random;
/**
 * Datos basicos de un alumno del centro
 * 
 * @author Sourdaci
 * @version 2015-03-09 01
 */
public class Alumno
{
    // instance variables - replace the example below with your own
    private static final int NUMERO_CLASE = 1;
    private String nombre;
    private int edad;
    private int[] notas;
    private static final int CANTIDAD_NOTAS_POR_DEFECTO = 7;
    private static final int MINIMO_MEDIA = 5;

    /**
     * Inicializacion de ficha del alumno
     * 
     * @param nombre El nombre del alumno
     * @param edad La edad del alumno
     * @param cantidadNotas El numero de asignaturas a evaluar. Si es erroneo se evaluaran 7
     */
    public Alumno(String nombre, int edad, int cantidadNotas)
    {
        this.nombre = nombre;
        this.edad = edad;
        if(cantidadNotas < 1){
            System.out.println("Cantidad de asignaturas incorrecta, aplicando valor por defecto");
            notas = new int[CANTIDAD_NOTAS_POR_DEFECTO];
        }else{
            notas = new int[cantidadNotas];
        }
        crearNotas();
    }

    /**
     * Da valor a las notas de las asignaturas del alumno de forma aleatoria [0-10]
     */
    private void crearNotas(){
        Random aleatorio = new Random();
        for (int i = 0; i < notas.length; i++){
            notas[i] = aleatorio.nextInt(11);
        }
    }
    
    /**
     * Calcula la media de notas del alumno
     * 
     * @return La nota media del alumno
     */
    public float mediaNotas(){
        float media = 0;
        for (int i = 0; i < notas.length; i++){
            media += notas[i];
        }
        media = media / notas.length;
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
        System.out.print("Notas: " + notas[0]);
        for (int i = 1; i < notas.length; i++){
            System.out.print(", " + notas[i]);
        }
        System.out.print("\n");
    }
}

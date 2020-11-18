
package practica07;

/**
 * Esta clase representa una entidad (Persona) del mundo real
 * @author Daniel Rojas
 */
public class Persona {
    private String nombre;
    private int edad;

    /**
     * Este es el constructor vacio de la clase Persona
     */
    public Persona() {
    }

    /**
     * Este es el constructor de la clase persona que recibe 2 parametros
     * @param nombre Recibe un String que representa el nombre del objeto
     * @param edad Recibe un entero que representa la edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Este metodo permite al usuario obtener el valor que almacena la variable nombre
     * @return Devuelve una cadena contenida en la variable nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Esta funcion permite al usuario establecer un valor a la variable nombre de la clase
     * @param nombre Recibe un String que se almacena en la variable nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este metodo permite al usuario obtener el valor que almacena la variable edad
     * @return Devuelve una cadena contenida en la variable edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Esta funcion permite al usuario establecer un valor a la variable edad de la clase
     * @param edad Recibe un entero que se almacena en la variable edad. 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}

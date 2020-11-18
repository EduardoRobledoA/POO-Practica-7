/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07;

/**
 * Esta clase representa una entidad (trabajador) del mundo real. (Hereda de la clase Persona).
 * @author Daniel Rojas,Eduardo Robledo
 */
public class Trabajador extends Persona{
    
    private int numTrabajador;
    private int sueldo;

    /**
     * Este es el constructor vacio de la clase Trabajador.
     */
    public Trabajador() {
    }
    
    /**
     * Este es el constructor de la clase Trabajador que recibe 4 parametros.
     * @param numTrabajador Recibe un entero que representa el numero de trabajador
     * @param sueldo Recibe un entero que representa el sueldo del trabajador
     * @param nombre Recibe un String que representa el nombre del trabajador
     * @param edad Recibe un entero que representa la edad del trabajador
     */
    public Trabajador(int numTrabajador, int sueldo, String nombre, int edad) {
        super(nombre, edad);
        this.numTrabajador = numTrabajador;
        this.sueldo = sueldo;
    }

    /**
     * Este metodo permite al usuario obtener el valor almacenado en la variable numTrabajador.
     * @return Retorna un valor entero almacenado en numTrabajador.
     */
    public int getNumTrabajador() {
        return numTrabajador;
    }

    /**
     * Este metodo permite al usuario establecer el valor de la variable numTrabajador.
     * @param numTrabajador Recibe un entero que representa el numero de trabajador.
     */
    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    /**
     * Este metodo permite al usuario obtener el valor almacenado en la variable sueldo.
     * @return Retorna un valor entero almacenado en sueldo.
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * Este metodo permite al usuario establecer el valor de la variable sueldo.
     * @param sueldo Recibe un entero que representa el sueldo del trabajador.
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}

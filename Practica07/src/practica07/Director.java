/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07;

/**
 * Esta clase representa una entidad (director) del mundo real. (Hereda de la clase Trabajador).
 * @author Daniel Rojas,Eduardo Robledo
 */
public class Director extends Trabajador{
    
    private int presupuesto;
    private String facultad;

    /**
     * Este es el constructor vacio de la clase Director.
     */
    public Director() {
    }

    /**
     * Este es el constructor de la clase Director que recibe 6 parametros.
     * @param presupuesto Recibe un entero que representa el presupuesto de la facultad.
     * @param facultad Recibe un String que representa la facultad que dirige el director.
     * @param numTrabajador Recibe un entero que representa numero de trabajador del director.
     * @param sueldo Recibe un entero que representa sueldo del director.
     * @param nombre Recibe un String que representa nombre del director.
     * @param edad Recibe un entero que representa la edad del director.
     */
    public Director(int presupuesto, String facultad, int numTrabajador, int sueldo, String nombre, int edad) {
        super(numTrabajador, sueldo, nombre, edad);
        this.presupuesto = presupuesto;
        this.facultad = facultad;
    }

    /**
     * Este metodo permite al usuario obtener el valor almacenado en la variable presupuesto.
     * @return Retorna un valor entero almacenado en presupuesto.
     */
    public int getPresupuesto() {
        return presupuesto;
    }

    /**
     * Este metodo permite al usuario establecer el valor de la variable presupuesto.
     * @param presupuesto Recibe un entero que representa el presupuesto de la facultad.
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    /**
     * Este metodo permite al usuario obtener el valor almacenado en la variable facultad.
     * @return Retorna un valor String almacenado en facultad.
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * Este metodo permite al usuario establecer el valor de la variable facultad.
     * @param facultad Recibe un String que representa el nombre de la facultad.
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07;

/**
 * Esta clase representa una entidad (profesor) del mundo real. (Hereda de la clase Trabajador).
 * @author Daniel Rojas,Eduardo Robledo
 */
public class Profesor extends Trabajador{
    
    private int clases;
    private String materia;

    /**
     * Este es el constructor vacio de la clase Profesor.
     */
    public Profesor() {
    }

    /**
     * Este es el constructor de la clase Profesor que recibe 6 parametros.
     * @param clases Recibe un entero que representa las clases que imparte el profesor.
     * @param materia Recibe un String que representa la materia que imparte el profesor.
     * @param numTrabajador Recibe un entero que representa el numero de trabajador del profesor.
     * @param sueldo Recibe un entero que representa el sueldo del profesor.
     * @param nombre Recibe un String que representa el nombre del profesor.
     * @param edad Recibe un entero que representa la edad del profesor.
     */
    public Profesor(int clases, String materia, int numTrabajador, int sueldo, String nombre, int edad) {
        super(numTrabajador, sueldo, nombre, edad);
        this.clases = clases;
        this.materia = materia;
    }

    /**
     * Este metodo permite al usuario obtener el valor almacenado en la variable clases.
     * @return Retorna un valor entero almacenado en clases.
     */
    public int getClases() {
        return clases;
    }

    /**
     * Este metodo permite al usuario establecer el valor de la variable clases.
     * @param clases Recibe un entero que representa el numero de clases del profesor.
     */
    public void setClases(int clases) {
        this.clases = clases;
    }

    /**
     * Este metodo permite al usuario obtener el valor almacenado en la variable materia.
     * @return Retorna un valor String almacenado en materia.
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Este metodo permite al usuario establecer el valor de la variable numTrabajador.
     * @param materia Recibe un String que representa la materia que imparte el profesor.
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
}

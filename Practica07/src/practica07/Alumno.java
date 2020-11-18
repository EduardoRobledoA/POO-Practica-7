/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07;

/**
 * Esta clase representa una entidad (alumno) del mundo real. (Hereda de la clase Persona).
 * @author Daniel Rojas,Eduardo Robledo
 */
public class Alumno extends Persona{
    
    private int numCuenta;
    private float promedio;
    private int numMaterias;

    /**
     * Este es el constructor vacio de la clase Alumno.
     */
    public Alumno() {
    }

    /**
     * Este es el constructor de la clase Alumno que recibe 5 parametros.
     * @param numCuenta Recibe un entero que representa el numero de cuenta del alumno.
     * @param promedio Recibe un flotante que representa el promedio del alumno.
     * @param numMaterias Recibe un entero que representa el numero de materias que cursa el alumno.
     * @param nombre Recibe un String que representa el nombre del alumno.
     * @param edad Recibe un entero que representa la edad del alumno.
     */
    public Alumno(int numCuenta, float promedio, int numMaterias, String nombre, int edad) {
        super(nombre, edad);
        this.numCuenta = numCuenta;
        this.promedio = promedio;
        this.numMaterias = numMaterias;
    }

    /**
     * Este metodo permite al usuario obtener el valor almacenado en la variable numCuenta.
     * @return Retorna un valor entero almacenado en numCuenta.
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * Este metodo permite al usuario establecer el valor de la variable numCuenta.
     * @param numCuenta Recibe un entero que representa el numero de cuenta del alumno.
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * Este metodo permite al usuario obtener el valor almacenado en la variable promedio.
     * @return Retorna un valor flotante almacenado en promedio.
     */
    public float getPromedio() {
        return promedio;
    }

    /**
     * Este metodo permite al usuario establecer el valor de la variable numCuenta.
     * @param promedio Recibe un flotante que representa el promedio del alumno.
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    /**
     * Este metodo permite al usuario obtener el valor almacenado en la variable numCuenta.
     * @return Retorna un valor entero almacenado en numMaterias.
     */
    public int getNumMaterias() {
        return numMaterias;
    }

    /**
     * Este metodo permite al usuario establecer el valor de la variable numCuenta.
     * @param numMaterias Recibe un entero que representa el numero de materias del alumno.
     */
    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }
    
    
}

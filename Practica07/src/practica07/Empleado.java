/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07;

/**
 *
 * @author Daniel Rojas,Eduardo Robledo
 */
public class Empleado {
    private String nombre;
    private int sueldo;
    private int numEmpleado;

    public Empleado() {
    }
    public Empleado(String nombre, int sueldo, int numEmpleado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.numEmpleado = numEmpleado;
    }
    
    public int aumentarSueldo(int porcentaje){
        sueldo+= (int) (sueldo*porcentaje /100);
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        if (sueldo >= 0)
            this.sueldo = sueldo;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + 
                ", numEmpleado=" + numEmpleado + '}';
    }
}

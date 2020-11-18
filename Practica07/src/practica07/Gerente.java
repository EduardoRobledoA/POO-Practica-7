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
public class Gerente extends Empleado {
    private int presupuesto;
    
    
    public Gerente() {
    }

    public Gerente(String nombre, int sueldo, int numEmpleado, int presupuesto) {
        super(nombre, sueldo, numEmpleado);
        this.presupuesto = presupuesto;
    }
    
    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public void setPresupuesto(int anio, float tasa){
        this.presupuesto = (int) (presupuesto /tasa *anio);
    }
    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}

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
public class Practica07 {

    public static void main(String[] args) {
      
        Empleado empleado = new Empleado();
        
        empleado.setNombre("Angel");
        empleado.setNumEmpleado(123);
        empleado.setSueldo(16000);
        System.out.println(empleado);
        
        empleado.aumentarSueldo(10);
        System.out.println(empleado);
        
        //Avtividad 2
        Gerente gerente1 = new Gerente();
        gerente1.setNombre("Cesar");
        gerente1.setNumEmpleado(12);
        gerente1.setSueldo(25000);
        gerente1.setPresupuesto(100000);
        
        System.out.println("\nNombre: "+gerente1.getNombre());
        System.out.println("NumEmpleado: "+gerente1.getNumEmpleado());
        System.out.println("Sueldo: "+gerente1.getSueldo());
        System.out.println("Presupuesto: "+gerente1.getPresupuesto());
        
        gerente1.setPresupuesto(500000);
        
        System.out.println("Presupuesto"+gerente1.getPresupuesto());
        
        //Actividad 3
        Gerente gerente2 = new Gerente("Julio",200000,88,500000);
        System.out.println("\nNombre: "+gerente2.getNombre());
        System.out.println("NumEmpleado: "+gerente2.getNumEmpleado());
        System.out.println("Sueldo: "+gerente2.getSueldo());
        System.out.println("Presupuesto: "+gerente2.getPresupuesto());
        
        //Actividad 4 sobreesctritura
        System.out.println("\n");
        System.out.println(gerente2);
        
        //Actividad 5 Sobrecarga
        System.out.println("\nPresupuesto: "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(100000);
        System.out.println("Presupuesto: "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(5, 5.5f);
        System.out.println("Presupuesto: "+gerente2.getPresupuesto());
    }
    
}

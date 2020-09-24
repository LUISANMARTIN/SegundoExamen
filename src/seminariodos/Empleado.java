/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminariodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Win10
 */
public class Empleado extends Persona{
    
    private int salario;

    public Empleado() {
       salario =0;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "salario=" + salario + " " + super.verDatos()+ '}';
    }
    
    public void agregarSalario(){
        
         boolean error = false;
        do{
           try{
            salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese salario, por favor"));
            error = true;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingreso no valido, Ingrese mumeros");
        } 
        }while(!error);
        
        //salario = Integer.parseInt(JOptionPane.showInputDialog("ingrese salario "));
    }
    
    
    
    
}

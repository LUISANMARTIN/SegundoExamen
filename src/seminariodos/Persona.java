/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminariodos;

import javax.swing.JOptionPane;


public class Persona {
    
    private int id;
    
    private String nombre;
    
    private String  apellido;

    public Persona() {
        id = 0;
        nombre = "";
        apellido = "";
    }

    public int getId() {        
        return id;
    }

    public void setId(int id) {
        id =Integer.parseInt(JOptionPane.showInputDialog("ingrese salario "));        
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = JOptionPane.showInputDialog("ingrese nombre ");
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        apellido = JOptionPane.showInputDialog("ingrese apellido ");
        this.apellido = apellido;
    }
    
    public void agreDatos(){
        
         boolean error = false;
        do{
           try{
            id = Integer.parseInt(JOptionPane.showInputDialog("id"));
            error = true;
        }catch(NumberFormatException e){
            System.out.println("por favor ingrese numeros");
        } 
        }while(!error);
       
        nombre = JOptionPane.showInputDialog("Ingrese nombre ");
        apellido = JOptionPane.showInputDialog("Ingrese apellido ");
        
        
        
    }
    
    public int verId(){
        return id;
    }
    
    public String verDatos(){
        return "ID="+id + " NOMBRE ="+nombre + " APELLIDO="+apellido;
    }

    
    
    
    
    
    
}

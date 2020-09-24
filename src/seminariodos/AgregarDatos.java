
package seminariodos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;





public class AgregarDatos {
    
    boolean verificar = false;
    int idVerificador;
    int contadora = 0;
    int idEliminar;
    int listado;
    int idActulizar;
    
    
    List <Empleado> miEmpleado = new ArrayList<>();
    
    
    public void agregar(){
        
       Empleado empNuevo = new Empleado();
       empNuevo.agreDatos();
       empNuevo.agregarSalario();
       idVerificador = empNuevo.verId();     
       comparar();
       if (verificar == true){
           System.out.println("El id ya existe, ingrese nuevo");
       }
       else{
           miEmpleado.add(empNuevo);
       }
       
        
    }
    
    public void actualizar(){
        System.out.println(miEmpleado);
        idActulizar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese id que desee actualizar"));
        miEmpleado.forEach(Empleado->{
             listado = listado + 1;
            
            if (Empleado.verId() == idActulizar){
                Empleado actualizar = new Empleado();
                actualizar.agreDatos();
                actualizar.agregarSalario();
                miEmpleado.set(listado -1, actualizar);
               
            }else{
                System.out.println("id no existe");
            }
        });
       
        
    }
    
    public void eliminar(){
        
        System.out.println(miEmpleado);
        idEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id que desee eliminar"));
        miEmpleado.forEach(Empleado->{ 
            contadora =contadora + 1;
            System.out.println(contadora);
            if(Empleado.verId()== idEliminar){
                contadora = contadora -1;
            }
        }
        );
        
        miEmpleado.remove(contadora);
        contadora = 0;
        
        
    }
    
    public void mostrar(){
        
        System.out.println(miEmpleado);
        
    }
    
    public void comparar(){
        miEmpleado.forEach(Empleado->{
            
            if (Empleado.verId()== idVerificador){
                verificar = true;
            }
        
       } );
     
    }
    
    
   
    
}

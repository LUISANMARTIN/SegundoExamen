
package seminariodos;

import java.util.ArrayList;
import java.util.*;

import java.util.List;
import java.util.stream.Collectors;

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
           verificar = false;
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
    
    public void mayorSalario(){
        Optional<Empleado> salarioMax = miEmpleado.stream()
    
     .max(Comparator.comparing(empleado-> empleado.getSalario()));
        
        System.out.println(salarioMax);
        
       
    }
    
    public void menorSalario(){
      Optional<Empleado> salarioMin = miEmpleado.stream()
    
     .min(Comparator.comparing(empleado-> empleado.getSalario()));
        
        System.out.println(salarioMin);
        
        
    }
    
    public void ordenarPorNombres(){
        List<Empleado> ordenarNombres = miEmpleado.stream()
                .sorted(Comparator.comparing(empleado-> empleado.getNombre()))
                .collect(Collectors.toList());
      
        ordenarNombres.forEach(System.out::println);
      
    }
    
    public void sumarSalarioMayores700000(){
         Integer sumarSalarios = miEmpleado.stream()
                 .filter(empleado-> empleado.getSalario() > 700000 )
                 .map(empleado-> empleado.getSalario())
                 .reduce(0, (accEdades, edad)-> accEdades + edad);
                
             
         System.out.println(sumarSalarios);
       
    }
    
    public void determinarApellidosComienzanConAoa(){
         Long numElementos = miEmpleado.stream() 
                .filter(empleado-> empleado.getApellido().charAt(0) =='a' || empleado.getApellido().charAt(0) =='A' )
               
                 .count();
                
                System.out.println(numElementos);
                 
        
        
    }
    
    public void mayorSalarios5(){
        List<Empleado> ordenarSalarios = miEmpleado.stream()
                .sorted(Comparator.comparing(empleado-> empleado.getSalario(),Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toList());
        ordenarSalarios.forEach(System.out::println);
        
    }
    
    
   
    
}

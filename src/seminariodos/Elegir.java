
package seminariodos;

import javax.swing.JOptionPane;





public class Elegir {
    AgregarDatos eleccion = new AgregarDatos();
    
    public void seleccionar(){
        boolean error = false;
        
        int num;
        do{
            try{
                do{      
                       num = Integer.parseInt(JOptionPane.showInputDialog(
                   "1: AGREGAR \n"
                 + "2: ACTUALIZAR  \n"
                 + "3: ELIMINAR \n"
                 + "4: MOSTRAR EMPLEADOS \n"
                 + "5: EMPLEADO MAYOR SALARIO \n" 
                 + "6: EMPLEADO MENOR SALARIO \n" 
                 + "7: ORDENAR POR NOMBRES \n"
                 + "8: SUMAR SALARIOS MAYORES A 700000 \n" 
                 + "9: TOTAL EMPLEADOS COMIENZAN CON A O a \n "
                 + "10 5 EMPLEADOS MAYOR SALARIO \n"         
                 + "11: SALIR"));
                       
            switch (num){
                
                
                case 1: eleccion.agregar();
                        break;
                        
                case 2: eleccion.actualizar();
                        break;
                        
                case 3: eleccion.eliminar();
                        break;
                case 4: eleccion.mostrar();
                        break;
                case 5: eleccion.mayorSalario();
                         break;
                case 6: eleccion.menorSalario();
                         break;
                case 7: eleccion.ordenarPorNombres();
                         break;
                case 8: eleccion.sumarSalarioMayores700000();
                         break;
                case 9: eleccion.determinarApellidosComienzanConAoa();
                         break;
                case 10:eleccion.mayorSalarios5();
                         break;
              
                
            }
            
                    }while(num!=11);                
                        break;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Ingrese numeros, por favor");
                    }
           
                    
        }while(!error);
                        
                                        
     
    }
    
}   
    
    
    
    
    


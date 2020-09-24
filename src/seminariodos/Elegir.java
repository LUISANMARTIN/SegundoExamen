
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
                 + "5: SALIR"));
            switch (num){
                
                
                case 1: eleccion.agregar();
                        break;
                        
                case 2: eleccion.actualizar();
                        break;
                        
                case 3: eleccion.eliminar();
                        break;
                case 4: eleccion.mostrar();
                        break;
              
                
            }
            
                    }while(num!=5);                
                        break;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Ingrese numeros, por favor");
                    }
           
                    
        }while(!error);
                        
                                        
     
    }
    
}   
    
    
    
    
    


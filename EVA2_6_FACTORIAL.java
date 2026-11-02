
package eva1_1_scope;

public class EVA2_6_FACTORIAL {
    public static void main(String[] args) {
    }
        public static int factorialCiclo(){
            int num = 5;
            int factorial=1;
          //factorial de 5= 5x4x3x2x1 --> 120

            for ( int i = 1;  i<= num; i++){
               factorial  *=i;
           }
            System.out.println(" El factorial es:  " + factorial );
            
           // int resu= 1;
            //return resu;
        return 0;
        }
        
        /*
         //public static int factorialCiclo(){
         int val1, val2, val3, val4,val5;
         float multi;
          //factorial de 5= 5x4x3x2x1 --> 120
        val1 = Integer.parseInt(JOptionPane.showInputDialog("   "));
        val2 = Integer.parseInt(JOptionPane.showInputDialog("   "));
        val3 = Integer.parseInt(JOptionPane.showInputDialog("   " ));
        val4 = Integer.parseInt(JOptionPane.showInputDialog("   "));
        val5 = Integer.parseInt(JOptionPane.showInputDialog("   "));
  
        System.out.println(" ");
             
        multi= val1 * val2 * val3 * val4 * val5;
             
        JOptionPane.showMessageDialog(null, "El resultado del factorial: " + multi);
            int resu= 1;
            //return resu;
        }
    
        */
    
      public int factorialRecu(int valor ){
     // lo quue resuelve el problema  (el metodo se llama a si mismo )
     //llamada recursiva 
    // detener la recursividad
  
      if (valor==0){
          return 1;
      }else{
           
          return valor * factorialRecu (valor -1);
            }
          }
 
     }



 


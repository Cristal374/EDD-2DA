
package eva1_1_scope;

import javax.swing.JOptionPane;

public class EVA2_7_FIBONACCI {
 public static void main(String[] args) {
     int posicion = 7;
     int resultado= fibonacci(posicion);
  
     // resultado   = Integer.parseInt(JOptionPane.showInputDialog(" "));
      JOptionPane.showMessageDialog(null, "La posicion es: " + posicion );    
 }
    public static int fibonacci(int posicion){
        if  (posicion == 0){
            return 1;
        }
        if  (posicion == 1){
            return -1; 
        }
        int resultado = fibonacci(posicion -1) +fibonacci ( posicion -2);
        return resultado;
        
    } 
    // fibonacci ( posi -2) + fibonacci(posi -1);
}

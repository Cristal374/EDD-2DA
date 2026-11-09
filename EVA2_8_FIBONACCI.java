package edd_eva2;

import javax.swing.JOptionPane;

public class EVA2_8_FIBONACCI {
 public static void main(String[] args) {
     int posicion = 8;
     int resultado= fibonacci(posicion);

     // resultado   = Integer.parseInt(JOptionPane.showInputDialog(" "));
      JOptionPane.showMessageDialog(null, "El resultado es: " + resultado );    
 }
    public static int fibonacci(int posicion){
        if  (posicion == 0){
            return 0;
        }
        if  (posicion == 1){
            return 1; 
        }
        int resultado = fibonacci(posicion -1) +fibonacci ( posicion -2);
        return resultado;

    } 
    // fibonacci ( posi -2) + fibonacci(posi -1);
}

package edd_eva2;

import java.util.Iterator;
import java.util.LinkedList;

public class EVA2_11_ITERATOR {
    public static void main ( String  [] args) {
    LinkedList<Integer> lista = new LinkedList<>();
    lista.add(100);  
    lista.add(200);  
    lista.add(300);  
    lista.add(400);  
    lista.add(500);  
    lista.add(600);  
    System.out.println(lista);   
  //  for (int i=0; i<lista.size(); i++){
    //System.out.println(lista.get(i));
    //}
    
    /// Nos pperimir¿te acceder a los elementos de la lista  sin recorrer cada vez  los nodos anteriores 
     Iterator<Integer> interador = lista.iterator();
     while (interador.hasNext()){
         System.out.println(interador.next());
     }
  }
} 

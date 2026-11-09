
package edd_eva2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EVA2_10_COLLECTION {
    public static void main ( String  [] args) {
    
      /*
        Lista doblemente enlazada: conectada por dos direcciones, hacia delante y hacia atras 
        */  
    LinkedList<Integer> lista = new LinkedList();
    lista.add(100);  
    lista.add(200);  
    lista.add(300);  
    lista.add(400);  
    lista.add(500);  
    lista.add(600);  
    lista.add(700);  
    System.out.println(lista);
    System.out.println("Tamaño de la lista: " + lista.size());
    lista.remove(3);
    System.out.println(lista);
       

    /*
    ArrayList: no es una lista es un arreglo, este si necesuta cambiar el tamaño, se
    crea un nuevo arreglo y se copia el contenido anterior 
    */
    
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add(" Hola");
    arrayList.add("Mundo");
    arrayList.add("!!");
    arrayList.add("¡Hola, mundo!");
    System.out.println(arrayList);
    System.out.println(arrayList.size());
    

    //stack: el ultimo en llegar es el primero en salir
    // LIFO
    Stack<Integer> stack= new Stack<>();
    stack.add(100);
    stack.add(300);
    stack.add(400);
    stack.add(500);
    stack.add(600);
    
    System.out.println(stack);
    System.out.println(stack.peek());
    System.out.println(stack);
    System.out.println(stack.pop());
    
  
    /*Queue
    FIFO: el primero en entrar es el primero en salir 
    */ 
    
    Queue<String> queue = new LinkedList<>();
    queue.add("Hola"); 
    queue.add("Mundo");
    queue.add("!!!");
    //queue.add("  ");
    System.out.println(queue);
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    
    }
}
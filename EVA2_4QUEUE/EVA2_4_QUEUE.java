package eva1_1_scope;

public class EVA2_4_QUEUE {

    private nodoQUEUE inicio;

    public static void main(String[] args) {
        
        /*
        listaDoble lista = new listaDoble();
        lista.agregarAlInicio(150);
        lista.agregarAlFinal(230);
        lista.agregarAlFinal(320);
        lista.agregarAlFinal(261);
        lista.agregarAlFinal(363);
        lista.agregarAlFinal(700);
        lista.agregarAlFinal(562);
        lista.imprimir();
        */

        System.out.println("<-------> ");
        System.out.println("Orden inverso");
        lista.imprimirInverso();
        System.out.println("<-------> ");

        // Eliminar un nodo al inicio de la lista 
        if (!lista.estaVacia()) {
            int elemento = lista.eliminarInicio();
            System.out.println("El elemento eliminado es:" + elemento);
            lista.imprimirInverso();
        } else {
            System.out.println("No hay datos");

        }
        //Insertar en una posicion
        System.out.println("  ");
        System.out.println ("Se incrementa de manera inversa");
        lista.insertarEn(1,200000); //Se coloca de manera inversa 

        lista.imprimirInverso();
    
        
        //Para buscar un elemento 
        //System.out.println("El elemento que deseamos buscar es: ");
        //f (lista.buscarLista(valor)==true){
       
        
     
    }

}

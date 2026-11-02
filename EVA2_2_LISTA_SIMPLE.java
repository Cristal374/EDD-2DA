package eva1_1_scope;

import java.util.Scanner;

public class EVA2_2_LISTA_SIMPLE {

    private Nodo inicio;

    // inicio = null;// si sale null la lista no tiene nodos

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.agregar(150);
        lista.agregar(250);
        lista.agregar(350);
        lista.agregar(480);
        lista.agregar(550);
        lista.agregar(350);
        lista.insertarEn(2, 456); 
        lista.imprimir();

        System.out.println("<------------------------------->  ");
        lista.imprimirInverso();

        //Saber si esta vacia la lista
        System.out.println("¿LA LISTA TIENE NODOS?");
        if (lista.estaVacia()) {
            
            System.out.println("No tiene nodos");
        } else {
            System.out.println("Si tiene nodos");

        }
        System.out.println("EL NUMERO DE NODOS ES: " + lista.longitud());
        System.out.print("EL NUMERO ENCONTRADO EN LA POSICION ES: ");
        System.out.print(lista.encontrarEn(5)); //Posicion que elegimos a encontrar
        lista.vaciarLista();
        lista.imprimir();
        //Buscamos un dato en nuestra lista
        // System.out.println("Posicion encontrada: " + lista.buscarNodo(350));

        Scanner sc = new Scanner(System.in);
        System.out.println("¿QUE NUMERO DESEA BUSCAR?");
        int buscar = sc.nextInt();//Colocar nextInt, double o line, menos en String
        if (lista.buscarNodo(buscar)) {
            System.out.println("El dato se encuentra");
        } else {
            System.out.println("Valor no encontrado");
            //lista.agregar(820);
            lista.agregar(260);
            lista.agregar(80);
            lista.agregar(650);
            lista.agregar(740);
            lista.agregar(150);
            lista.agregar(250);
            lista.agregar(350);
            lista.agregar(480);
            lista.agregar(550);
            lista.agregar(260);
            lista.imprimir();
        }

        System.out.println("INGRESE EL NUMERO A ELIMINAR:  " + lista.eliminarPosicion());
        lista.eliminarPosicion();
        //int posicion= sc.nextInt();
        System.out.println("Valores restantes:  ");
        lista.imprimir();
        System.out.println("<------------------->");
        // Agregamos variable
        int eliminado = lista.eliminarPosicion();
        System.out.println("POSICION QUE DESEA ELIMINAR: " + eliminado);
        lista.imprimir();
         System.out.println("<------------------->");
        
        System.out.println ("Valor eliminado" );
        lista.eliminarValor(350);
        lista.imprimir();
        
        System.out.println(" la lista esta vacia");
        lista.vaciarLista();
        lista.imprimir();
        // Un elemento en posicion especifica
        
    }

//int  [] arreglo = new int [100000];
    //long ini, fin, tiempo;
        // La big oh de la operacion es de (N2)
    //ini = System.nanoTime();
    //for (int i = 0; i < 10000000; i++) {
    //  lista.agregar((int) (Math.random() * 100));
        //fin = System.nanoTime();
    //tiempo = fin - ini;
    //System.out.println("Tiempo de la lista :  " + tiempo + "ns");
}

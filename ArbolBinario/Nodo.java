
package edd_eva2;


public class Nodo {
    int valor;
    Nodo derecha;
    Nodo izquierda;    

    // constructores 

   /*
     public Nodo() {
        this.derecha=derecha;
        this.izquierda=izquierda;
    }
    */

    public Nodo(int valor, Nodo derecha, Nodo izquierda) {
        this.valor = valor;
        this.derecha = derecha;
        this.izquierda = izquierda;
    }
    
    
    public Nodo(int valor) {
        this.valor=valor;
        this.derecha=null;
        this.izquierda=null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }


    
    
}

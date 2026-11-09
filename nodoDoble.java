
package eva1_1_scope;

class nodoDoble {
    int dato;
    nodoDoble derecha;
    nodoDoble izquierda;
    //Para cuando ya hay nodos
    public nodoDoble(int d, nodoDoble s, nodoDoble a){
        dato = d;
        derecha = s;
        izquierda = a;
    }
    //Para cuando no hay nodos aun
    public nodoDoble(int d){
        dato=d;
        derecha= null;
        izquierda = null;
        //this (d, null, null)
    }
    
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public nodoDoble getSiguiente() {
        return derecha;
    }

    public void setSiguiente(nodoDoble derecha) {
        this.derecha = derecha;
    }

    public nodoDoble getAnterior() {
        return izquierda;
    }

    public void setAnterior(nodoDoble izquierda) {
        this.izquierda = izquierda;
    }
    /*
    
package eva1_1_scope;

class nodoDoble {
    int dato;
    nodoDoble derecha;
    nodoDoble izquierda;
    //Para cuando ya hay nodos
    public nodoDoble(int d, nodoDoble s, nodoDoble a){
        dato = d;
        derecha = s;
        izquierda = a;
    }
    //Para cuando no hay nodos aun
    public nodoDoble(int d){
        dato=d;
        derecha= null;
        izquierza = null;
        //this (d, null, null)
    }
    
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public nodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public nodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(nodoDoble anterior) {
        this.anterior = anterior;
    }
  
}


    */
  
}


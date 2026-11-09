
package eva1_1_scope;

public class nodoQUEUE {
    int dato;
    nodoQUEUE siguiente, anterior;

    public nodoQUEUE(int d, nodoQUEUE s, nodoQUEUE a) {
        dato = d;
        siguiente = s;
        anterior = a;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public nodoQUEUE getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoQUEUE siguiente) {
        this.siguiente = siguiente;
    }

    public nodoQUEUE getAnterior() {
        return anterior;
    }

    public void setAnterior(nodoQUEUE anterior) {
        this.anterior = anterior;
    }
    
    

}

    


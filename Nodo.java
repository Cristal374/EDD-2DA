
package eva1_1_scope;

public class Nodo {
//ATRIBUTOS 
 int valor;
 Nodo siguiente;
    public Nodo() {
        siguiente = null;
    }
    public Nodo(int val) {
        this.valor = val;
        siguiente = null;
    }
    
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    Object getDerecha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 

 
  
}

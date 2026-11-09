package edd_eva2;

public class ArbolBinario {

    private Nodo root = null;

    public ArbolBinario() {
        root = null;
    }

    // agregar datos a nuestro arbol
    public void agregar(int valor) {
        if (root == null) {
            root = new Nodo(valor);
        } else {
            agregarRecu(root, valor);// empiezo en root, porque es mi nodo inicio
        }
    }

    private void agregarRecu(Nodo actual, int valor) {
        if (valor > actual.getValor()) {// derecha
            if (actual.getDerecha() != null) {//nos dice si esta ocupado
                agregarRecu((Nodo) actual.getDerecha(), valor);
            } else {
                actual.setDerecha(new Nodo(valor));
            }
        } else if (valor < actual.getValor()) {
            if (actual.getIzquierda() != null) {// esta ocupado
                agregarRecu(actual.getIzquierda(), valor);
            } else {
                actual.setIzquierda(new Nodo(valor));
            }
        }
    }

    public void preOrder(Nodo actual) {
        if (actual != null) {
            System.out.println(actual.getValor());
            preOrder(actual.getIzquierda());
            preOrder((Nodo) actual.getDerecha());
        }
    }

    public void preOrderRecu(Nodo actual) {
        System.out.println(actual.getValor() + "-"); // visita el nodo

        if (actual.getIzquierda() != null) {
            preOrderRecu(actual.getIzquierda());
        }
        if (actual.getDerecha() != null) {
            preOrderRecu(actual.getDerecha());
        }
    }
}

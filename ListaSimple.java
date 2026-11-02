package eva1_1_scope;

public class ListaSimple {
    int cont=0;
    private Nodo fin;//ULTIMO NODO QUE TENEMOS EN LA LISTA
    private Nodo inicio;
     //CONSTRUCTOR
    public ListaSimple() { 
        inicio = null; //APUNTA AL PRIMER NODO - SE ACABA DE CREAR= NO TIENE NODOS
        fin = null; // //NO TIENE NINGUN NODO
    }
    
  public void agregar(int valor) {
    Nodo nuevo = new Nodo(valor); // Nuevo dato que vamos a guardar
    if (inicio == null) { //No tenemo nodo aun 
        inicio = nuevo; // inicio de nodo 
        fin = nuevo; // fin de mis nodos
    } else { // Si si tiene valor, se agrega lo siguiente 
        Nodo temp = inicio; // Nodo inicio 
        while (temp.getSiguiente() != null) {
            temp = temp.getSiguiente();
        }
        temp.setSiguiente(nuevo); // siguiente nodo 
        fin = nuevo;
    }
}
     public boolean listaVacia(){
              if (inicio==null){
                  return true;                
              }else 
                  return false;
          }    
          public void vaciarLista(){
              inicio = null; 
              fin = null;
              cont =0;
         }
       //Para vaciar la lista
          
          
          
    public void imprimir() {
        //Valores de la lista de codigo-practica 1
        //Eficiencia de imprimir los datos
        Nodo temp = inicio; // nuestro nodo de inicio 
        while (temp != null) {
            System.out.println("[" + temp.getValor() + "]"); // 
            temp = temp.getSiguiente();
        }
        System.out.println("");
   
    }
    
    // METODO PARA IMPRIMIR EN ORDEN INVERSO
   public void imprimirInverso() {
    imprimirAux(inicio);
}
private void imprimirAux(Nodo temp) {
    if (temp == null) {
        return;
    }
    imprimirAux(temp.getSiguiente());
    System.out.println(temp.getValor());
}
// BIg o es (N) 
    // Contador para saber cuantos nodos tenemos
 // HACER QUE LA LISTA PARA QUE SEA 0(1)
    public int longitud(){
    Nodo temp = inicio;

    while (temp != null) {
        cont++;
        temp = temp.getSiguiente();
    }

    return cont;
}
   public int contador(int valor, int temp) {
        int cont = 0;
        Nodo nodo = inicio;
        while (nodo != null) {
            cont++;
            nodo = nodo.getSiguiente();
        }
        return cont;
    }

      //Para saber si la lista esta vacia 
    public boolean estaVacia() {
        if (inicio==null){ 
            return true;
       }else {
           return false;
       }
    } 
        //Ultima longitud en (n) -1
        // ES o(n)
    
    public int encontrarEn(int posicion) {
    Nodo temp = inicio;
    for (int i = 0; i < posicion; i++) {
        temp = temp.getSiguiente();
    }
    return temp.getValor();
    
    // Agregar  un valor en una posicion especifica 
}   // O(N)
    public void insertarEn(int posicion, int valor) {
    Nodo nuevo = new Nodo(valor);
    Nodo temp = inicio;
    for (int i = 0; i < posicion - 1; i++) {
        temp = temp.getSiguiente();
    }
    nuevo.setSiguiente(temp.getSiguiente());
    temp.setSiguiente(nuevo);
}     
    // 
     public boolean buscarNodo(int val){ //para saber si se encuentra o no
        boolean encontrado =false;
        Nodo aux= inicio;
        while(encontrado!=true && aux!=null)// Se ejecute mientras aux es diferente que null
//Cuando se encunuentre se deja de ejecutar
        {
       if(val == aux.valor){
       encontrado=true;
          }
       else{
           aux=aux.siguiente;
              }
       if (encontrado==true)break;
        }
        return encontrado;
    }
    
    
    public int eliminarPosicion(){
      //  if (inicio== null){ 
      //comprobar que inicio es igual a null
            // if (inicio != null){ inicio es diferente de null
        //}
        int eliminar = inicio.valor;
        if(cont==1){
            inicio=null;
            fin=inicio; //fin apunta a inicio que es fin           
        }
        else{
        inicio=inicio.siguiente; //accede al siguiente nodo
        }
        return eliminar;
    }
    
    public int posicionX(int dato) {
    Nodo actual = inicio;

    while (actual != null) {
        if (actual.getValor() == dato) {
            return actual.getValor();
        }
        actual = actual.getSiguiente();
    }

    return -1;
}  //
    public void eliminarValor(int valor) {
    Nodo temp = inicio;
    Nodo ant = null;

    while (temp != null) {
        if (temp.getValor() == valor) {
            if (ant == null) {
                inicio = temp.getSiguiente();
            } else {
                ant.setSiguiente(temp.getSiguiente());
            }
            return;
        }
        ant = temp;
        temp = temp.getSiguiente();
    }
}
       /*
    
    public void agregar(int valor) { //CREAMOS UN NODO CON NUESTRO VALOR ESPERADO [9]
        Nodo nuevo = new Nodo(valor);
        //Verificar si tiene nodos 
        if (inicio == null) { //no tiene nodo
            inicio= nuevo;//NODO NUEVO
            fin= nuevo; //ULTIMO NODO
            
        } else { //Si tiene nodo
            Nodo temp = inicio;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
                fin = nuevo;
            }
        }
    }
    */
    // Nuestr big oh es (N)

    
    /*
     
    public int buscarDato(int valor) {
    Nodo temp = inicio;
    int posicion =0;

    while (temp != null) {
        if (temp.getValor() == valor) {
            return posicion;
        }
        temp = temp.getSiguiente();
        posicion++;
    }
    return -1;
}
    */
}

  



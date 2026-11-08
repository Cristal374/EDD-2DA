
package eva1_1_scope;
public class MYQUEUE {
    private nodoDoble inicio,fin;
    private int valor;
     //Cambia como los lee
    
    //Inicializar inicio y fin
    public MYQUEUE(){
        inicio=fin=null; //Como estan vacios se inicia en null
        this.valor=0;
    }
    //Metodo para saber si esta vacia 
    public boolean estaVacia(){
        return inicio==null; //retorna true
    }
    
    //Metodo para agregar al final
   
    public void agregarAlFinal( int d){
        if(!estaVacia()){ //minimo 1 nodo
        fin= new nodoDoble(d, null, fin );
            fin.anterior.siguiente=fin;
        }else{
                inicio=fin=new nodoDoble(d);           
        }
    }
   
    //metodo para agregar al inicio
     public void agregarAlInicio( int d){
        if(!estaVacia()){ //minimo 1 nodo
        inicio= new nodoDoble(d, inicio, null );
            inicio.siguiente.anterior=inicio;
        }else{
                fin=inicio=new nodoDoble(d);           
        }
        valor++;
    }    
    
     public void imprimirInverso(){
         nodoDoble temp= fin;
         while (temp != null){ //Valor actual
           System.out.println("[" + temp.getDato() + "]"); 
             temp = temp.anterior; //Avanzamos hacia el nodo anterior
         }
     }
    
     public int eliminarInicio(){
         int elemento= inicio.dato;// inicio o fin
         if (inicio==fin){
             inicio=fin=null;
         
         }else{
             inicio=inicio.siguiente;
             inicio.anterior=null;
         }
         return elemento;
     

     
     /*
       public void agregar(int valor) {
    nodoDoble nuevo = new nodoDoble(valor);
    if (inicio == null) { 
        inicio = nuevo;
        fin = nuevo;
    } else { 
        nuevo.anterior=fin; //el nuevo apunta hacia atras 
        fin.setSiguiente(nuevo); 
        fin = nuevo;
    }
  }
     */
 
     }
      public void imprimir() {
        nodoDoble temp = inicio;
        while (temp != null) {
            System.out.println("[" + temp.getDato() + "]"); // 
            temp = temp.getSiguiente();
        }
        System.out.println("");
   
    }
     //Metodo para buscar un  nodo
     /*
       public  boolean buscarLista (int elemento){
         nodoDoble temporal = inicio;
         while (temporal!= null && temporal.dato!= elemento){
             temporal=temporal.siguiente;
         }    
      return temporal!=null;
      }
    
      
      */
    public int encontrarEn(int posicion) {
    nodoDoble temp = inicio;
    for (int i = 0; i < posicion; i++) {
        temp = temp.getSiguiente();
    }
    return temp.getDato();
    }
   
       public void insertarEn(int posicion, int valor) {
    nodoDoble nuevo = new nodoDoble(valor);
    nodoDoble temp = inicio;
     //
    for (int i =0; i < posicion - 1; i++) {
        temp = temp.getSiguiente();
    } //conectamos con el nodo sig
    nuevo.setSiguiente(temp.getSiguiente());
    temp.anterior= temp;
     if (temp.siguiente!= null){
         temp.siguiente.anterior = nuevo;
     }//se conecta con el nuevo nodo
     temp.siguiente=nuevo;
     if (nuevo.siguiente== null){
         fin=nuevo;
     }
     
       }   
      
        public int longitud(){
     int cont = 0;
    nodoDoble temp = inicio;

    while (temp != null) {
        cont++;
        temp = temp.getSiguiente();
    }
    return cont;
     }   
  // Agrega un nodo a nuestro kiwi al final de la lista
  public void push (int valor){
  agregar(valor);
        }
    }   
 //convinacion de insertar  y encintrar pra p

/*
  //lee la posicion del valor en la posicion determinada, pero sin eliminarlo 
  public int peek(){   
  }
  // lee el valor de la posicion determinasa y despues la elimina 
  public int pop(){
      
  }
*/




package eva1_1_scope;

public class EVA2_1_REFERENCIAS {

    public static void main(String[] args) {

        Ejemplo ejemplo1 = new Ejemplo();
        System.out.println("ejemplo1 =" + ejemplo1);
        System.out.println("ejemplo.val =" + ejemplo1.val);
        System.out.println("ejemplo.otro =" + ejemplo1.otro);
       
        ejemplo1.otro= new Ejemplo();
        System.out.println("ejemplo1 =" + ejemplo1.otro);
        System.out.println("ejemplo.val =" + ejemplo1.otro.val);
        System.out.println("ejemplo.otro =" + ejemplo1.otro.otro);
       
         ejemplo1.otro.otro = new Ejemplo();
         ejemplo1.otro.otro.otro = new Ejemplo (); // Lista, cadena de nuestros datos con punto partida, de inicio a fin 
         ejemplo1.otro.otro.otro.otro = new Ejemplo (); 
         
         Ejemplo siguiente = ejemplo1;
         while(siguiente !=null){
                System.out.println("[" + siguiente.val +"]");      
          siguiente = siguiente.otro;
         }
            System.out.println("");
         
    } // podemos agregar datos mientras tengamos memoria 
    // Terminologia de lista se llama 
    
}
    class Ejemplo {
    int val = 5;
    Ejemplo otro;

}

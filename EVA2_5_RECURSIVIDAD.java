
package eva1_1_scope;


public class EVA2_5_RECURSIVIDAD {
public static void main(String[] args) {
    imprimirInvCiclo (5);
}
    public static void imprimirInvCiclo(int valor){
             for (int i=valor; i>=1; i--){
                 System.out.print(i+ "-");
                 
             }            
       }
    //La recursividad es para que el problema se vaya haciendo mas pequeño
     public static void imprimirInvRec(int valor){
         if (valor>=1){      // detiene la recursividad, al no ponerlo se llena el stack y no funciona 
     //0 no es mayor que uno, por lo tanto se detiene
      
     System.out.print(valor + "-");
     imprimirInvRec(valor -1); //va reduciendo de 5 a 4 (llamada recursiva)

         }
     }
}
    

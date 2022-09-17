package Pagina1;
import java.util.Scanner;

public class ParOImpar8 {

	public static void main(String[] args) {
		
		int numero;
        Scanner SC = new Scanner( System.in );

        System.out.println( "Introduzca un numero entero: " );
        numero = SC.nextInt();

   
       if(numero==0) {
    	   System.out.println("El numero no es par ni impar");
       }
       
        else if ( numero % 2 == 0 )
       {
           System.out.println( "ES PAR" );
       }
       else
       {
           System.out.println( "ES IMPAR" );
       }
 
      
        
        
       System.out.println("Fin del programa. Te amo Eli <3");
        
        SC.close();
        
    }
}

	



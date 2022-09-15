package Pagina1;

import java.util.Scanner;

public class MayorOIgual {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		
		Double A,B;
	System.out.println("Ingrese el primer valor : ");
	 A = SC.nextDouble();


	System.out.println("Ingrese segundo valor : ");
	B = SC.nextDouble();
	
	
	
	if(A==B)
    System.out.println("Los valores son iguales :D");
  if(A>B)
      System.out.println("El numero mayor es : " +A);
  if(B>A)   
      System.out.println("el numero mayor es : " +B);
  
  System.out.println("Programa Finalizado :). E<3 ");

	SC.close();
	}

}

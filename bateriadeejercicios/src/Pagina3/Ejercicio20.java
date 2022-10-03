package Pagina3;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
int Tamano = 0;
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Ingrese el tamanio del cuadro ");
		 Tamano = SC.nextInt();

		 if(Tamano >= 0 && Tamano <= 60) {
			 for (int i = 0; i < Tamano; i++) {
				System.out.print("*");
			}
			 System.out.println("");
			 
			 
			 for(int i = 0; i < Tamano-2; i++) {
				 System.out.print("*");
				 for (int j = 0; j < Tamano-2; j++) {
					System.out.print("*");
				}
				 System.out.println("*");
			 }
			 
			 for (int i = 0; i < Tamano; i++) {
				System.out.print("*");
			}
		 }
		 
		 

SC.close();
System.out.println(" ");
System.out.println("Fin del programa. Te amo Eli <3");
	}

}

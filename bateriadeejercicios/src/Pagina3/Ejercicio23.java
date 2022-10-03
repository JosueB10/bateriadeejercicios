package Pagina3;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
Scanner SC = new Scanner(System.in);
		
		byte  OPC;
		double PrecioT = 0;
		String Orden = "";
		double CAC;
		
		System.out.println("Bienveniodo a bocadillos Nicaragua");
		
		do {

			
			System.out.println("1) Bocadillo de jamon ----- $ 1,5");
			System.out.println("2) Refresco de cacao ----- $ 1,05");
			System.out.println("3) Cerveza ----- $ 0,75");
			System.out.println("4) Terminar su pedido");
			System.out.println("");
			System.out.println("Seleccionar Opcion: "); OPC = SC.nextByte();
			
			while(OPC <= 0) {
				System.out.println("Elija una opcion correcta por favor");
				OPC = SC.nextByte();
			}
			
			CAC=PrecioT*36.10;
			switch(OPC) {
			
			
			
			case 1: 
				System.out.println("Ha elegido un bocadillo de jamon \nDesea elegir algo mas? \n");
				if(OPC == 1) {
					PrecioT += 1.5;
					Orden += "Bocadillo de jamon $ 1,5 \n";
				}
				break;
			case 2: 
				System.out.println("Ha elegido un refresco de cacao \nDesea elegir algo mas? \n");
				if(OPC == 2) {
					PrecioT += 1.05;
					Orden += "Refresco de cacao $ 1,05 \n";
				}
				break;
			case 3: 

				System.out.println("Ha elegido una cerveza \nDesea elegir algo mas? \n");
				if(OPC == 3) {
					PrecioT += 0.75;
					Orden += "Cerveza $ 0,75 \n";
				}
				break;
			case 4: 

				System.out.println(" Factura ");
				System.out.println(Orden);
				System.out.println("El precio total de su pedido es: " + PrecioT+ "$");
				System.out.println("El precio total en cordobas es de: "+CAC+ "C$");
				break;
				}

		}while(OPC != 4);

		System.out.println("Fin del programa. Te amo Eli <3");
		SC.close();

	}

}

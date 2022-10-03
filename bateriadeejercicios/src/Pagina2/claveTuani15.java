package Pagina2;

import java.util.Scanner;

public class ClaveTuani15 {
	
	public static void main(String []args) {
	Scanner SC= new Scanner (System.in);
	
	int cont=0,bandera=0;
	String contrasena="tuani",intento="";
	
	
	
	
	
do {
	System.out.println("Escribe la contrasena: ");
	intento = SC.nextLine();
	
	if (contrasena.equals (intento)) {
		System.out.println("La contrasena es correcta!");
		System.out.println("Bienvenido! ");
		bandera=1;
	}else {
		System.out.println("La contrasena es incorrecta. Intentelo nuevamente");
		cont++;
		
			
			if(cont==3) {
				System.out.println("Ha acabado sus tres intentos");
				
			}
	}
} while ((cont!=3)&& bandera==0);


System.out.println("Fin del programa. Te amo Eli <3");
	SC.close();
	

	}
}


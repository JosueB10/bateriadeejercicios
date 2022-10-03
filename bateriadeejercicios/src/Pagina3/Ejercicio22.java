package Pagina3;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
	    int anio;
	
	    System.out.println("Biemvenido.Este programa calcula si un anio es bisiesto:");
	    System.out.print("Introduce el año : ");
	    anio = SC.nextInt();
	    

	    if (anio % 400 == 0){
	        System.out.println("Es un anio bisiesto.");
	    }else if (anio % 100 == 0){
	        System.out.println("No es un anio bisiesto");
	    }else if (anio % 4 == 0){
	        System.out.println("Es un anio bisiesto");
	    }else{
	        System.out.println("No es un anio bisiesto");
	    }
	    
	  
SC.close();
System.out.println("Fin del programa. Te amo Eli <3");
	}

}

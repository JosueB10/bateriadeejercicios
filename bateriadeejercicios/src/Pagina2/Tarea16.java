package Pagina2;

import java.util.Scanner;

public class Tarea16 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		int contador,maximo,minimo,num,suma;
		double media;

		System.out.println("Ingrese un numero: ");
		num=SC.nextInt();

		minimo=num;

		maximo=num;

		suma=0;

		contador=0;

		while ((num!=0)) {

		if ((num>maximo)) {

		maximo=num;

		}

		if ((num<minimo)) {

		minimo=num;

		}

		suma=suma+num;

		contador=contador+1;

		num=SC.nextInt();

		}

		media=suma/(contador);

		System.out.println("El maximo es: "+maximo);
		System.out.println("El minimo es: "+minimo);
		System.out.println("La media es: "+media);
		
		SC.close();
		System.out.println("Fin del programa. Te amo Eli <3");
		}
	}



package Pagina2;

import java.util.Scanner;

public class Tarea18 {

	public static void main(String[] args) {

Scanner SC=new Scanner(System.in);




int dia,mes,anio;

String nombremes="";

System.out.print("Ingrese el dia: ");
dia = SC.nextInt();
System.out.print("Ingrese el mes: ");
mes = SC.nextInt();
System.out.print("Ingrese el anio: ");
anio = SC.nextInt();

if(dia < 1 || dia > 31) {
	do {
		System.out.println("Dia fuera de rango");
		System.out.println("Ingrese el dia: ");
		dia = SC.nextInt();
	}while(dia>0 && dia < 32);
}
if(mes < 1 || mes > 12) {
	do {
		System.out.println("Mes fuera de rango");
		System.out.println("Ingrese un mes: ");
		mes = SC.nextInt();
	}while(mes>0 && dia < 13);
}
if(anio < 1) {
	do {
		System.out.println("Anio fuera de rango");
		System.out.println("Ingrese un anio: ");
		anio = SC.nextInt();
	}while(anio > 0);
}

switch(mes) {

case 1: nombremes = "Enero";
case 2: nombremes = "Febrero";
case 3: nombremes = "Marzo";
case 4: nombremes = "Abril";
case 5: nombremes = "Mayo";
case 6: nombremes = "Junio";
case 7: nombremes = "Julio";
case 8: nombremes = "Agosto";
case 9: nombremes = "Septiembre";
case 10: nombremes = "Octubre";
case 11: nombremes = "Noviembre";
case 12: nombremes = "Diciembre";

}

System.out.println(dia + " de " + nombremes + " de " + anio);
SC.close();
System.out.println("Fin del programa. Te amo Eli <3");
   }
}
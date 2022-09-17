package Pagina2;
import java.util.Scanner;
public class SumaDeLosPrimerosNPares13 {
	
	
	public static int SumaNumerosPares (int Numero) {
		if (Numero==0) {
			return 0;
			
		}
		if (Numero % 2== 0) {
			
			
			return Numero + SumaNumerosPares(Numero - 1);
		}
		
	
	}
	
	
public static void main(String [] args) {
	
	Scanner SC=new Scanner(System.in);
	
	System.out.println("Ingrese un numero: ");
	int Numero=SC.nextInt();
	
	System.out.println("La suma es "+SumaNumerosPares(Numero));
	
	SC.close();
	
}
}

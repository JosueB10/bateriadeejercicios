package Pagina1;
import java.util.Scanner;

public class PorcentajeAlumnos6 {

	public static void main(String[] args) {
		
		Scanner SC=new Scanner(System.in);
		int Ninos,Ninas,TotalAlum,PorNinos,PorNinas,PorAlum;
		
		
		System.out.println("Ingrese el Total de alumnos en el curso: ");
		TotalAlum=SC.nextInt();
		
		System.out.println("Ingrese el numero de Ninos en el curso: ");
		Ninos=SC.nextInt();
		
		System.out.println("Ingrese el numero de Ninas en el curso: ");
		Ninas=SC.nextInt();
		
		
		PorNinos=(Ninos*100)/TotalAlum;
		PorNinas=100-PorNinos;
		PorAlum=100;
		
		System.out.println("El porcentaje de alumnos es del "+PorAlum+"%");
		System.out.println("El porcentaje de Ninos en el curso es de: "+PorNinos+"%" );
		System.out.println("El porcentaje de Ninas en el curso es de: "+PorNinas+"%" );
		
		SC.close();
		System.out.println("Fin del programa. Te amo Eli <3");
	
	}

}

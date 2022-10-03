package Pagina2;

public class Tarea17 {

	public static void main(String[] args) {
int x=1, y=0, z=0;
		

System.out.println("Bienvenido");
		while(x <=100) {
			
			if(x % 2 == 0) {
				y = y + 1;
				System.out.println("Multiplo de 2: " + x);
			}
			if(x % 3 == 0) {
				z = z + 1;
				System.out.println("Multiplo de 3: " + x);
			}
			
			x = x + 1;
		}
		
		System.out.println("Numeros multiplos de 2: " + y);
		System.out.println("Numeros multiplos de 3: "  + z);

		System.out.println("Fin del programa. Te amo Eli <3");
	}

}

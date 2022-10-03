package Pagina4;

import java.util.Scanner;

public class Tarea25 {

	public static void main(String[] args) {
		float celsius;
		byte n;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Que sistema desea convertir?");
        System.out.println("1.De celsius a fahrenheit ");
        System.out.println("2.De fahrenheit a celsius");
        n=SC.nextByte();
        
        if(n==1) {
        System.out.println("Ingresa los grados celsius: ");
        celsius = SC.nextFloat();
        // Calcular
        float fahrenheit = celsiusAFahrenheit(celsius);
        System.out.println(+celsius+" grados celsius son " +fahrenheit+ " grados fahrenheit");
        }else {
        	
        	System.out.println("Ingresa los grados Fahrenheit: ");
            float fahrenheit = SC.nextFloat();
            // Calcular
            float celsius1 = fahrenheitACelsius(fahrenheit);
            System.out.println(+fahrenheit+" grados Fahrenheit son " +celsius1+ " grados celsius");
        	
        	
        	
        }
        
        SC.close();
        System.out.println("Fin del programa. Te amo Eli <3");
    }

    public static float celsiusAFahrenheit(float celsius) {
        return (celsius * 1.8f) + 32;
    }

    public static float fahrenheitACelsius(float fahrenheit) {
        return (fahrenheit - 32) / 1.8f;

        
        
	}

}

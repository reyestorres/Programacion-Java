package pack;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//solicita al usuario tres distancias, dise�a un programa que muestre la suma de las 3 longitudes introducidas (medida en centimetros)
		//la primera, medida en milimetros
		//la segunda, medidad en centimetros
		//la ultima, medida en metros
		int milimetros;
		int centimetros;
		int metros;
		int suma;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce una medida en milimetros: ");
		milimetros = teclado.nextInt();
		System.out.println("Introduce una medida en centimetros: ");
		centimetros = teclado.nextInt();
		System.out.println("Introduce una medida en metros: ");
		metros = teclado.nextInt();
		milimetros = milimetros/10;
		metros = metros * 100;
		suma = milimetros + centimetros + metros;
		System.out.println("El resultado es: " +suma +" de las tres longitudes");
		
		
		
	}

}

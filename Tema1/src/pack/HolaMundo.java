package pack;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		System.out.println("Introduce un número: ");
		Scanner teclado = new Scanner(System.in);
		int num;
		num = teclado.nextInt();
		System.out.println("El número introducido es: " + num);
		double raiz=Math.sqrt(num);
		System.out.println("La raiz del número " + num + "es: " +raiz);
		System.out.println("La raiz del número "+ num + "es: " + Math.sqrt(num));
		double numero;
		System.out.println("Introduce un numero con coma decimal: ");
		numero = teclado.nextDouble();
		System.out.println("El número tecleado es: " +numero);
		String cadena;
		System.out.println("Introduce una cadena por teclado: ");
		teclado.nextLine();
		cadena = teclado.nextLine();
		System.out.println("La cadena es: "+cadena);
		
		
		
	}

}

package pack;

import java.util.Scanner;

public class Actividad1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dise�ar una aplicacion que calcule la longitud y el area de una circunferencia,
		//para ello el usuario debe introducir el radio que debera contener decimales
		double longitud;
		double area;
		double radio;
		double resultado;
		System.out.println("Introduce el radio con decimales: ");
		Scanner teclado = new Scanner(System.in);
		radio = teclado.nextDouble();
		longitud = 2*Math.PI*radio;
		area = Math.PI*Math.pow(radio, 2);
		System.out.println("El radio es: " +radio +" el area es: " +area +" y la longitud es:" +longitud);
		
	}

}

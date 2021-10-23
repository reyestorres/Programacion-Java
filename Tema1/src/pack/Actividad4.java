package pack;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crea un programa que pida la base y la altura de un triangulo y muestre su area
		//area del triangulo = base * altura / 2
		int base;
		int altura;
		double area;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce la base del triangulo: ");
		base = teclado.nextInt();
		System.out.println("Introduce la altura del triangulo: ");
		altura = teclado.nextInt();
		area = base * altura /2;
		System.out.println("El resultado es: " +area);
		
		
		
	}

}

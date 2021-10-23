package actividadesAplicacion;

import java.util.Scanner;

public class Actividad2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double area;
		int base;
		int altura;
		System.out.println("Introduce un numero: ");
		base = teclado.nextInt();
		System.out.println("Introduce otro numero: ");
		altura = teclado.nextInt();
		if (0 < base ||  0 < altura ) {
			area = ((double)base * altura)/2;
			System.out.println("La area es: " +area);
		} else {
			System.out.println("Error: es negativo ");
		}
		
	}

}

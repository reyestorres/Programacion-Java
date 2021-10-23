package actividadesResueltas;

import java.util.Scanner;

public class Actividad3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//diseñar un programa que muestre, para cada numero introducido por teclado, si es par, si es positivo y su cuadrado.
		//El proceso se repetira hasta que el numero introducido sea 0.
		Scanner teclado = new Scanner(System.in);
		boolean esPar, esPositivo;
		System.out.println("Introduzca un numero: ");
		int num = teclado.nextInt();
		while (num != 0) {
			esPar = num % 2 == 0 ? true : false;
			esPositivo = num >= 0 ?  true : false;
			System.out.println("Es par?: " +esPar+ " Es positivo?: " +esPositivo);
			System.out.println("Cuadrado: " +num*num);
			System.out.println("Introduzca otro numero: ");
			num = teclado.nextInt();
		}
	}

}

package actividadesResueltas;

import java.util.Scanner;

public class Actividad3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pedir por consola un numero n y dibujar un triangulo rectangulo de n elementos de lado,
		//utilizando para ello asteriscos (*). Por ejemplo, para n=4
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		int n = teclado.nextInt();
		for(int fila=1; fila<=n;fila++) {
			for(int col=fila;col<=n;col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}

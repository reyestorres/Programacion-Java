package actividadesResueltas;

import java.util.Scanner;

public class Actividad3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir una aplicacion para aprender a contar, que pedira un numero n 
		//y mostrara todos los numeros del 1 al n
		//n > 1
		Scanner teclado = new Scanner(System.in);
		int n;
		int i;
		System.out.println("Introduce un numero: ");
		n= teclado.nextInt();
		for(i =1; i <=n; i++) {
			System.out.println(i);
		}
	}

}

package actividadesResueltas;

import java.util.Scanner;

public class Actividad3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir diez numeros enteros por teclado y mostrar la media
		Scanner teclado = new Scanner(System.in);
		int num;
		int suma=0;
		double media;
		int i;
		System.out.println("En este programa debe introducir 10 numeros.");
		for (i=1; i<=10;i++) {
			System.out.println("Introduce el " +i+"º numero: ");
			num = teclado.nextInt();
			suma = suma +num;
		}
		media = suma/10.0;
		System.out.println("La media de los numeros es: " +media);
	}

}

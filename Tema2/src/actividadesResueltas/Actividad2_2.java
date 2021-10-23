package actividadesResueltas;

import java.util.Scanner;

public class Actividad2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int n2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		n1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		n2 = teclado.nextInt();
		if (n1==n2) {
			System.out.println("Son iguales");	
		} else {
			System.out.println("Los numero son distintos");
		}
	}

}

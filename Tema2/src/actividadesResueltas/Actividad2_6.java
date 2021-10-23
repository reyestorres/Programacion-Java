package actividadesResueltas;

import java.util.Scanner;

public class Actividad2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce otro numero: ");
		num2 = teclado.nextInt();
		if (num1 == num2) {
			System.out.println("Son iguales ");
		} else {
			if (num1 > num2) {
				System.out.println(num1 +" es mayor que " +num2);
			} else {
				System.out.println(num2 +" es mayor que " +num1);
			}
		}
	}

}

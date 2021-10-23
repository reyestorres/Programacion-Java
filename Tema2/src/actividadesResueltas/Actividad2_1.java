package actividadesResueltas;

import java.util.Scanner;

public class Actividad2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner teclado = new Scanner(System.in);
			int num;
			System.out.println("Introduzca un numero: ");
			num = teclado.nextInt();
			if (num%2==0) {
				System.out.println("El numero es par");
			} else {
				System.out.println("El numero es impar");
			}
			
	}

}

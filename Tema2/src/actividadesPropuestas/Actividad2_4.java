package actividadesPropuestas;

import java.util.Scanner;

public class Actividad2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		boolean esMultiplo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el siguiente numero: ");
		num2 = teclado.nextInt();
		esMultiplo = num1%num2==0;
		System.out.println("Es multiplo: " +esMultiplo);
		
	}

}

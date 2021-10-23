package actividadesPropuestas;

import java.util.Scanner;

public class Actividad2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		boolean esDistinto;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce otro numero: ");
		num2 = teclado.nextInt();
		esDistinto = num1 !=num2 || num1 ==0 || num2==0;
		System.out.println("Es distinto: " +esDistinto );
		
	}

}

package pack;

import java.util.Scanner;

public class Actividad1_9v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Decir si un número es impar o no
		int num;
		System.out.println("Introduce un numero: ");
		Scanner teclado= new Scanner(System.in);
		num = teclado.nextInt();
		boolean esImpar = num%2!=0;
		System.out.println("¿Es impar? " +esImpar);
		
	}

}

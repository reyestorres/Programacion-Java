package pack;

import java.util.Scanner;

public class Actividad1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer un numero por teclado, saber si el resto de la division entera es cero o no
		//num%2 ==0;
		int num;
		System.out.println("Introduce un numero: ");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextInt();
		boolean esPar = num%2==0;
		System.out.println("Es par? " +esPar);
		
		
		
		
	}

}

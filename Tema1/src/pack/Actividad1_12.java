package pack;

import java.util.Scanner;

public class Actividad1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa que pida un numero al usuario y muestre su valor absoluto
		Scanner teclado =new Scanner(System.in);
		System.out.println("Escribe un numero (negativo o positivo): ");
		int a = teclado.nextInt();
		int valorAbsoluto = a < 0 ? -1 * a : a;
		System.out.println("El valor absoluto de " + a +" es " + valorAbsoluto);
		
		//version 2 de resolver el ejercicio
		Scanner sc =new Scanner(System.in);
		System.out.println("Escribe un numero (negativo o positivo): ");
		int n = sc.nextInt();
		int valorAbsoluto2 =Math.abs(n);
		System.out.println("El valor absoluto de " + n +" es " + valorAbsoluto2);
		
		
	}

}

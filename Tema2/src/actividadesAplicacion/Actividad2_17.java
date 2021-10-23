package actividadesAplicacion;

import java.util.Scanner;

public class Actividad2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int num1;
		int num2;
		int resultado;
		System.out.println("Juego de la suma");
		num1 =(int)(Math.random()*99+1);
		System.out.println("Primer numero: " +num1);
		num2 =(int)(Math.random()*99+1);
		System.out.println("Segundo numero: " +num2);
		System.out.println("Los numeros son: " +num1 +" y " +num2);
		System.out.println("Cuantos suman estos numeros? ");
		resultado = teclado.nextInt();
		if (resultado == num1 + num2) {
			System.out.println("El resultado es correcto: " +resultado);
		} else {
			System.out.println("El resultado es incorrecto: " +resultado);
		}
	}

}

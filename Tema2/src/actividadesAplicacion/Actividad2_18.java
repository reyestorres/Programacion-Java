package actividadesAplicacion;

import java.util.Scanner;

public class Actividad2_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int num1;
		int num2;
		int resultado =0;
		int operacion=0;
		num1 =(int)(Math.random()*99+1);
		System.out.println("Primer numero: " +num1);
		num2 =(int)(Math.random()*99+1);
		System.out.println("Segundo numero: " +num2);
		System.out.println("Los numeros son: " +num1 +" y " +num2);
		System.out.println("Elige una operacion sumar(1), restar(2) o multiplicar(3): ");
		operacion = teclado.nextInt();
		switch(operacion) {
		case 1 : 
			System.out.println("sumar");
			System.out.println("Cuantos suman estos numeros? ");
			resultado = teclado.nextInt();
			if (resultado == num1 + num2)
				System.out.println("El resultado es correcto: " +resultado);
			else System.out.println("El resultado es incorrecto" );
			break;

		case 2:
			System.out.println("restar");
			System.out.println("Cuanto restan estos numeros? ");
			resultado = teclado.nextInt();
			if (resultado == num1 - num2)
				System.out.println("El resultado es correcto: " +resultado);
			else System.out.println("El resultado es incorrecto" );
			break;
		case 3:
			System.out.println("multiplicar");
			System.out.println("Cuanto multiplican estos numeros? ");
			resultado = teclado.nextInt();
			if (resultado == num1 * num2)
				System.out.println("El resultado es correcto: " +resultado);
			else System.out.println("El resultado es incorrecto");
			break;
			default: System.out.println("No existe esa operacion");
		
		}
		
	
		
		
	}

}

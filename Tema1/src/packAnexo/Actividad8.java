package packAnexo;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int multiplicar;
		int division;
		int suma;
		int resta;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		num2 = teclado.nextInt();
		suma = num1 + num2;
		System.out.println("El resultado de la suma es: " +suma);
		resta = num1 - num2;
		System.out.println("El resultado de la resta es: " +resta);
		multiplicar = num1 * num2;
		System.out.println("El resultado de la multiplicacion es: " +multiplicar);
		division = num1 / num2;
		System.out.println("El resultado de la division es: " +division);
	}

}

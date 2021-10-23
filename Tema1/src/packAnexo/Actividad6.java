package packAnexo;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int aux;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		num2 = teclado.nextInt();
		System.out.println("Los valores iniciales son " +num1 + " y " +num2);
		aux = num1;
		num1 = num2;
		num2 = aux;
		System.out.println("Los valores cambiados son " +num1 + " y " +num2);
		
		
	}

}

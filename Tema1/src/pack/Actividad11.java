package pack;

import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pedir dos numero al usuario a y b. Debera mostrar true si ambos numeros son iguales y false si no son iguales
		int a;
		int b;
		boolean resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero(a): ");
		a = teclado.nextInt();
		System.out.println("Introduce otro numero(b): ");
		b = teclado.nextInt();
		resultado = a==b;
		System.out.println("Los numeros " +a + " y " +b +" son: " +resultado);
		
		
	}

}

package pack;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int m;
		int suma;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un numero: ");
		n = teclado.nextInt();
		System.out.println("Introduce otro numero: ");
		m = teclado.nextInt();
		suma = m - n % m;
		suma = (suma==m ? 0 : suma);
		System.out.println("La suma es: " + suma);
		
	}

}

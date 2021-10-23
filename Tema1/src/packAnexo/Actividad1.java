package packAnexo;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		boolean positivo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		n = teclado.nextInt();
		positivo = n  >= 1;
		System.out.println("El resultado es de " +n+ " es: "+positivo);
		
	}

}

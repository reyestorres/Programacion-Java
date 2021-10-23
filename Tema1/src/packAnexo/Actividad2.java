package packAnexo;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		boolean par;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		n = teclado.nextInt();
		par = n % 2==0;
		System.out.println("El resultado es de " +n+ " es: "+par);
	}

}

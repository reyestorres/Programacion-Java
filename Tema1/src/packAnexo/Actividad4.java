package packAnexo;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		boolean multiploCinco;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		n = teclado.nextInt();
		multiploCinco = n % 5==0;
		System.out.println("El resultado es de " +n+ " es: "+multiploCinco);
	}

}

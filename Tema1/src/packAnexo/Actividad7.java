package packAnexo;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		int edad;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Introduce una edad: ");
		edad = teclado.nextInt();
		System.out.println("Tu nombres es: " +nombre+ " y tu edad es: " +edad);
	}

}

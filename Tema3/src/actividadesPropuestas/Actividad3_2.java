package actividadesPropuestas;

import java.util.Scanner;

public class Actividad3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pide al usuario un numero y muestra en pantalla la salida.
		Scanner teclado = new Scanner(System.in);
		int num;
		int contador;
		System.out.println("Introduce un numero: ");
		num = teclado.nextInt();
		for (contador=1; contador<=num ;contador++) {
			System.out.println(contador+ " Eco");
			
		}
	}

}

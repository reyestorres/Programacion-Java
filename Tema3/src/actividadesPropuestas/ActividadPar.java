package actividadesPropuestas;

import java.util.Scanner;

public class ActividadPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa donde introduce un numero y dice si es par y luego escribir todos los pares que se han leido

		int num;
		int contador = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Introduce un numero par: ");
			num = teclado.nextInt();
		} while(num %2 !=0);
		while (contador <=num) {
			System.out.println(contador);
		contador +=2;
		}
		System.out.println("Los numeros pares son: " +num );
	}
	
	
}

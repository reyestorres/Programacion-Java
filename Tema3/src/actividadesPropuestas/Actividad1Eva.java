package actividadesPropuestas;

import java.util.Scanner;

public class Actividad1Eva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pedir un numero por teclado y mostrar la lista de todos los multiplos de 7 
		 * menores que dicho numero.
		 * do { } while(); 
		 * while() { }; 
		 * Pido un numero cualquiera mayor que siete*/
		Scanner teclado = new Scanner(System.in);
		int num;
		int contador =0;
		do {
			System.out.println("Introduce un numero: ");
			num = teclado.nextInt();
		} while(num %7 !=0);
		System.out.println("Los multiplos de 7 son: ");
				while (contador <=num) {
					System.out.println(contador);
					contador +=7;
				}
				
			
	}

}

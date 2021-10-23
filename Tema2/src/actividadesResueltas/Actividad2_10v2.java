package actividadesResueltas;

import java.util.Scanner;

public class Actividad2_10v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una nota: ");
		int nota = teclado.nextInt();
		switch (nota) {
		case 0, 1, 2, 3, 4 :
			System.out.println("Insuficiente");
		case 5 :
			System.out.println("Suficiente");
		case 6: 
			System.out.println("Bien");
		case 7, 8 :
			System.out.println("Notable");
		case 9, 10 :
			System.out.println("Sobresaliente");
		default :
			System.out.println("Error: nota no valida");
		}
	}

}

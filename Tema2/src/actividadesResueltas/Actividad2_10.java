package actividadesResueltas;

import java.util.Scanner;

public class Actividad2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una nota: ");
		int nota = teclado.nextInt();
		if ( 0 <= nota && nota < 5) {
			System.out.println("Insuficiente");
		} else if (nota ==5) {
			System.out.println("Suficiente");
		} else if (nota ==6) {
			System.out.println("Bien");
		}else if (nota ==7 || nota ==8) {
			System.out.println("Notable");
		} else if (nota ==9 || nota ==10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Error: nota no valida");
		}
	}

}

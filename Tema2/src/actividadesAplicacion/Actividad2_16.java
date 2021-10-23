package actividadesAplicacion;

import java.util.Scanner;

public class Actividad2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int num;
		System.out.println("Introduce un numero: ");
		num = teclado.nextInt();
		if(num < 0 ) {
			
			System.out.println("El valor absoluto es: " + (-num));
		} else {
			System.out.println("El valor absoluto es: " +num);
		}

	
	}

}

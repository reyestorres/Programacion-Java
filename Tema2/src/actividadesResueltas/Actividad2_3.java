package actividadesResueltas;

import java.util.Scanner;

public class Actividad2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce el primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		num2 = teclado.nextInt();
			if(num1 >num2) {
				System.out.println(num1 +"Es mayor que " + num2);
			} else {
				System.out.println(num2 +"Es mayor que " +num1);
			}
		
		
		
	}

}

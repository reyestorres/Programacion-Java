package actividadesResueltas;

import java.util.Scanner;

public class Actividad2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int mayor;
		int menor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce otro numero: ");
		num2 = teclado.nextInt();
		mayor = num1 > num2 ? num1 : num2;
		menor = num1 < num2 ? num1 : num2;
		System.out.println(mayor +", " + menor);
		
	}

}

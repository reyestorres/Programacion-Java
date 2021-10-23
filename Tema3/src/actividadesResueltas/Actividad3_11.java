package actividadesResueltas;

import java.util.Scanner;

public class Actividad3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir un numero y calcular su factorial. 
		//Por ejemplo, el factorial de 5 se denota 5! y es igual a 5 x 4 x 3 x 2 x 1 = 120.
		//validacion del dato para que sea positivo con un do while.
		Scanner teclado = new Scanner(System.in);
		int num;
		double factorial =1;
		do {
			System.out.println("Introduce un numero: ");
			num = teclado.nextInt();
		}while(num <0);
		for(int i=num;i >0;i--) {
			factorial = factorial *1;
		}
		System.out.println("El factorial de " +num+ " es: " +factorial);
	}

}

package actividadesResueltas;

import java.util.Scanner;

public class Actividad3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Desarrollar un juego que ayude a mejorar el calculo mental de la suma.
		//El jugador tendra que introducir la solucion de la suma  de dos numeros aleatorios comprendidos
		//entre 1 y 100. Mientras la solucion introducida sea correcta, el juego continuara.
		//En caso contrario, el programa terminara y mostrara el numero de operaciones realizadas correctamente.
		Scanner teclado = new Scanner(System.in);
		int num1, num2, resultado;
		int numOperaciones =0;
		do {
			num1 = (int) (Math.random()*100+1);
			num2 = (int) (Math.random()*100+1);
			System.out.println(num1+" + " +num2+ " = ");
			resultado = teclado.nextInt();
			numOperaciones++;
			
		}while (resultado == num1 + num2);
		System.out.println("Has conseguido realizar: " +(numOperaciones -1) + " sumas consecutivas");
	}

}

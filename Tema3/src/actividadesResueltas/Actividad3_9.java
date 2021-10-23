package actividadesResueltas;

import java.util.Scanner;

public class Actividad3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*implementar una aplicacion que pida al usuario un numero comprendido entre 1 y 10.
		Hay que mostrar la tabla de multiplicar de dicho numero, asegurandose de que el numero
		introducido se encuentra en el rango establecido */
		Scanner teclado = new Scanner(System.in);
		int num;
		int tabla;
		int i;
		do {
			System.out.println("Introduce un numero entre 1 y 10: ");
				num = teclado.nextInt();
		} while(num < 1 || num > 10 );
		System.out.println("La tabla de multiplicar de " +num+ " es: ");
		for(i =1; i <=10;i++) {
			tabla = num*i;
			System.out.println(num+ "x" +i+ "=" +tabla);
			
		}
		
	}

}

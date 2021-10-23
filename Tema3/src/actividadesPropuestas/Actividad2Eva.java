package actividadesPropuestas;

import java.util.Scanner;

public class Actividad2Eva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Leer un numero entre 1 y 10 y mostrar su tabla de multiplicar 
		 * Con:
		 * 	do { } while(); 
		 * 	while() { }; 
		 */
		Scanner teclado = new Scanner(System.in);
		int num;
		int tabla=0;
		int num2=1;
		do {
			System.out.println("Introduce un numero del 1 al 10: ");
				num = teclado.nextInt();
		} while(num < 1 || num > 10 );
		System.out.println("La tabla de multiplicar de " +num +" es: ");
				while(num2 <=10) {
					tabla=num*num2;
					System.out.println( num+ "x" +num2+ "="+tabla);
					num2++;
					
				}
				
	} 

}


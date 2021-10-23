package actividadesPropuestas;

import java.util.Scanner;

public class ActividadRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dos valores el numero de la base y el numero de la altura
		Scanner teclado = new Scanner(System.in);
		
		int altura;
		int base;
		int i,j;
			System.out.println("Introduce la altura: ");
			altura = teclado.nextInt();
			System.out.println("Introduce la base: ");
			base = teclado.nextInt();
			
		for( i=1; i<=altura;i++) {
			for ( j=1;j<=base;j++) {
				System.out.print("* ");
				
			}
		
			System.out.println("");
		
	
			
		}
	}

}

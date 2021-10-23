package actividadesPropuestas;

import java.util.Scanner;

public class ActividadRectanguloHueco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int altura;
		int base;
		int i,j;
			System.out.println("Introduce la altura: ");
			altura = teclado.nextInt();
			System.out.println("Introduce la base: ");
			base = teclado.nextInt();
//		for(i=0;i<base;i++) {
//			System.out.print("* ");	
//		}
//		for( i=1; i<=altura-2;i++) {
//			System.out.print("* ");	
//			for ( j=1;j<=base-2;j++) {
//					System.out.print(" ");	
//	
//					
//			}
//			System.out.println("*");
//		}
//		for ( j=1;j<=base;j++) {
//			
//			System.out.print("*");	
//	}
//		System.out.println();
			for(i = 0; i<altura; i++) {
				for(j = 0; j<base; j++) {
					if(i==0 || j == 0 || i==altura-1 || j == base-1) System.out.print("X ");
					else System.out.print("  ");
				}
				System.out.println("");
			}		
	}

}

package actividadesAplicacion;

import java.util.Scanner;

public class Actividad3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//solicita al usuario un numero n y dibuja un triangulo de base y altura n, de la forma
		//(para n igual a 4)
		//aumentar *
		Scanner teclado = new Scanner(System.in);
		int n;
		int i,j,asteriscos;
		System.out.println("Introduce n: ");
		n = teclado.nextInt();
		for(i=1; i<=n; i++) {
			for(j=n-i;j>0; j--) { //espacios
				System.out.print(" ");	
			}
			for(asteriscos=1; asteriscos<=i;asteriscos++) { //asteriscos
				System.out.print("*");	
				System.out.print(" ");
			}
			System.out.println("");
		}
		
	}

}

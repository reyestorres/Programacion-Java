package actividadesAplicacion;

import java.util.Scanner;

public class Actividad4_13 {
	
	static void muestraPares(int n) {
		int contador =0;
				while (contador <=n) {
					System.out.println(contador);
					contador +=2;
				}
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		do {
			System.out.println("Introduce un numero: ");
			n = teclado.nextInt();
		} while(n %2 !=0);
		 muestraPares(n);
	}

}

//> <
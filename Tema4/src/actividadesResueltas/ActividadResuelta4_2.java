package actividadesResueltas;

import java.util.Scanner;

public class ActividadResuelta4_2 {
	
		static void mostrar(int a, int b) {
		int mayor = a > b ? a : b;
		int menor = a < b ? a : b;
		for(int i=menor; i<=mayor; i++) {
			System.out.println(i);
			}
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca primer numero: ");
		int a = teclado.nextInt();
		System.out.print("Introduzca segundo numero: ");
		int b = teclado.nextInt();
		mostrar(a,b);
		}
	
	
	
	
}

//> <
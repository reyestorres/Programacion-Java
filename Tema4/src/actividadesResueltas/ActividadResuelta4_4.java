package actividadesResueltas;

import java.util.Scanner;

public class ActividadResuelta4_4 {
	static int maximo(int a, int b) {
		int max;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		return(max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int a = teclado.nextInt();
		System.out.print("Introduzca otro numero: ");
		int b = teclado.nextInt();
		System.out.print("El numero mayo es: " +maximo(a, b));
	}

}

//> <
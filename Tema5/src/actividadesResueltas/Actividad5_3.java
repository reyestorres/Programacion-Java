package actividadesResueltas;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce cuantos numeros quieres introducir: ");
		int numeros = teclado.nextInt();
		int num [] = new int[numeros];
		for(int i=0;i<num.length;i++) {
			System.out.println("Introduce un numero: ");
			num[i] = teclado.nextInt();
		}
		System.out.println("Los numeros en orden inverso son: ");
		for(int i= num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
	}

}

//> <
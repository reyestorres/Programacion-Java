package actividadesResueltas;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Actividad5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		double num [] = new double [5];
		for(int i=0; i<num.length;i++) {
			System.out.println("Introduce 5 numeros decimales: ");
			num[i] = teclado.nextDouble();
		}
		System.out.println(Arrays.toString(num));
	}

}

//> <
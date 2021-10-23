package actividadesResueltas;

import java.util.Locale;
import java.util.Scanner;

public class Actividad2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num;
		Scanner teclado = new Scanner (System.in);
		teclado.useLocale(Locale.US);
		System.out.println("Introduce un numero positivo o negativo: ");
		num = teclado.nextDouble();
		if (-1 < num && num < 1 && num !=0) {
		 System.out.println("Es un numero casi -cero");	
		} else {
			System.out.println("No es casi -cero");
		}
			
	}

}

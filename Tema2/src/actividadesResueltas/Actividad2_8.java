package actividadesResueltas;

import java.util.Locale;
import java.util.Scanner;

public class Actividad2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		double a,b,c;
		double x1,x2,d;
		System.out.println("Introduce el primer coeficiente (a): ");
		a = teclado.nextInt();
		System.out.println("Introduce el segundo coeficiente (b): ");
		b = teclado.nextInt();
		System.out.println("Introduce el tercer coeficiente (c): ");
		c = teclado.nextInt();
		d = (b * b - 4 * a * c);
		if (d < 0) {
			System.out.println("No existe soluciones reales");
		} else {
			if (a == 0) {
				System.out.println("No es una ecuacion de segundo grado");
			} else {
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b + Math.sqrt(d)) / (2 * a);
				System.out.println("Solucion 1: " +x1);
				System.out.println("Solucion 2: " +x2);
			}
		}
	}

}

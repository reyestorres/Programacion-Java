package actividadesAplicacion;

import java.util.Scanner;

public class Actividad4_12 {
	
		static double distancia(double x1, double y1, double x2, double y2) {
			double distancia;
			 distancia= Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1+y2,2));
			System.out.println("La distancia es: " +distancia);
			return distancia;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca x1: ");
		double x1 = teclado.nextDouble();
		System.out.print("Introduzca x2: ");
		double x2 = teclado.nextDouble();
		System.out.print("Introduzca y1: ");
		double y1 = teclado.nextDouble();
		System.out.print("Introduzca y2: ");
		double y2 = teclado.nextDouble();
		distancia(x1, y1, x2, y2);
	}

}

//> <
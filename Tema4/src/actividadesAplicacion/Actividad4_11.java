package actividadesAplicacion;

import java.util.Scanner;

public class Actividad4_11 {
	
	static void esfera (double radio) {
		double superficie, volumen;
			superficie = 4*Math.PI * Math.pow(radio, 2);
			System.out.println("La superficie es de: " +superficie);
			volumen = 4*Math.PI/3 * Math.pow(radio, 3);
			System.out.println("El volumen es de: " +volumen);
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el radio: ");
		double radio = teclado.nextDouble();
		esfera(radio);
		
	}

}

//> <
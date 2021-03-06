package pack;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Actividad1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras
		Diseña una aplicacion que solicite las ventas(en kilos) */
		//cantidad vendida en el semestre 1 (peras y manzanas)
		//cantidad vendida en el semestre 2 (idem)
		final double PRECIO_MANZANAS = 2.35;
		final double PRECIO_PERAS = 1.95;
		int vManzana1Sem, vManzana2Sem;
		int vPeras1Sem, vPeras2Sem;
		double impTotal;
		Scanner teclado =new Scanner(System.in);
		System.out.println("Para las manzanas: ");
		System.out.println("Ventas (en kilos) del primer semestre: ");
		vManzana1Sem = teclado.nextInt();	
		System.out.println("Ventas (en kilos) del segundo semestre: ");
		vManzana2Sem = teclado.nextInt();
		System.out.println("Para las peras: ");
		System.out.println("Ventas (en kilos) del primer semestre: ");
		vPeras1Sem = teclado.nextInt();
		System.out.println("Ventas (en kilos) del segundo semestre: ");
		vPeras2Sem = teclado.nextInt();
		impTotal = (vManzana1Sem + vManzana2Sem) * PRECIO_MANZANAS;
		impTotal = (vPeras1Sem + vPeras2Sem) * PRECIO_PERAS;
		System.out.println("El importe total es de: " + impTotal + " euros");
		
		//otra version de sacar decimales
		double a = 1.2345;
		double b = 1.2356;
		DecimalFormat formatter = new DecimalFormat("#.##");
		System.out.println(formatter.format(a));
		System.out.println(formatter.format(b));
		
		
		
		
		
	}

}

package pack;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//infantil 15,50€, adulto 20€, impTotal = 100€ descuento 5%
		//pedir por teclado cuantas entradas quieres y si es mayor que 100 hacer el descuento
		final double PRECIO_INFANTIL = 15;
		final double PRECIO_ADULTO = 20;
		int numEntradaInfantil;
		int numEntradaAdulto;
		int numEntrada;
		double importeTotal, descuento;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce cuantas entradas quieres de infantil: ");
		 numEntradaInfantil = teclado.nextInt();
		System.out.println("Introduce cuantas entradas quieres de adulto: ");
		numEntradaAdulto = teclado.nextInt();
		importeTotal = numEntradaInfantil + PRECIO_INFANTIL + numEntradaAdulto + PRECIO_ADULTO;
		System.out.println("Importe entrada: " +importeTotal);
		descuento = importeTotal >= 100 ? importeTotal*5.0/100.0 :0;
		System.out.println("Descuento: " +descuento);
		importeTotal -=descuento;
		System.out.println("Importe final: " +importeTotal);
		
	}

}

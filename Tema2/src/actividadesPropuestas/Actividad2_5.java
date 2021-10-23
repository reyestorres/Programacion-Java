package actividadesPropuestas;

import java.util.Scanner;

public class Actividad2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Aforo maximo del local, el precio por entrada y numero de entradas vendidas.
		//Si el numero de entradas vendidas no supera el 20% del aforo del local, se cancela el concierto
		//si el numero de entradas vendidas no supera el 50% del aforo del local, se realiza una rebaja del 25% del precio de la entrada
		Scanner teclado = new Scanner(System.in);
		int entradasVendidas;
		int aforo;
		int precioEntradas;
		System.out.println("Introduce el aforo maximo del local: ");
		aforo= teclado.nextInt();
		System.out.println("Introduce el precio de las entradas: ");
		precioEntradas= teclado.nextInt();
		System.out.println("Introduce el numero de entradas vendidas: ");
		entradasVendidas= teclado.nextInt();
		double recaudacion = entradasVendidas * precioEntradas;
		if(entradasVendidas/aforo < 0.2 ) {
			System.out.println("Se cancela el concierto ");
			recaudacion =0;
		} else if (entradasVendidas/aforo < 0.5) {
			System.out.println("Rebaja del 25% de la entrada" + (precioEntradas *= (1-0.25)) );
			
		} else  {
			System.out.println("Se ha recaudado: " + recaudacion );
		}
		
	}

}

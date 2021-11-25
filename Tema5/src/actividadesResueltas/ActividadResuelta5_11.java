package actividadesResueltas;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadResuelta5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Longitud de la combinacion secreta: " );
		int longitud = teclado.nextInt();
		int combSecreta[]=new int[longitud];
		int combJugador[]=new int[longitud];
		generaCombinacion(combSecreta);
		System.out.println(Arrays.toString(combSecreta));
		System.out.println("Escriba una combinacion: " );
		leeTabla(combJugador);
		
		while(!Arrays.equals(combSecreta, combJugador)) {
			muestraPistas(combSecreta, combJugador);
			System.out.println("Escriba una combinacion: " );
			leeTabla(combJugador);
		}
		System.out.println("La camara esta abierta!" );
	}
	
	private static void generaCombinacion(int t [] ) {
		// TODO Auto-generated method stub
		final int MAX=5;
		for(int i=0;i<t.length;i++) {
			t[i] =(int)(Math.random()*MAX+1);
		}
	}
	private static void leeTabla(int t[] ) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<t.length;i++) {
			t[i]=teclado.nextInt();
		}
	}
	private static void muestraPistas(int secreta[], int jugador[]) {
		// TODO Auto-generated method stub
		System.out.println("Pistas: " );
		for(int i=0;i<jugador.length;i++) {
			System.out.print(jugador[i] );
			if(secreta[i]>jugador[i]) {
				System.out.println("Mayor" );
			}else if(secreta[i]<jugador[i]) {
				System.out.println("Menor " );
			}else {
				System.out.println("Igual " );
			}
		}
	}

}

//> <
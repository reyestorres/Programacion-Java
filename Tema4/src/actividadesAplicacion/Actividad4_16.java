package actividadesAplicacion;

import java.util.Scanner;

public class Actividad4_16 {
	static void divisoresPrimos(int numero) {
		System.out.println("Divisores primos de " +numero);
		for(int i =1;i<=numero;i++) {
			esPrimoDivisor(numero);
			if(esPrimoDivisor(i) && numero % i==0) {
				System.out.println("El numero: "+i);
				
			}
		}
	
	}
	private static boolean esPrimoDivisor(int numero) {
		// TODO Auto-generated method stub
		boolean primo = true;
		int i = 2;
		if(numero<2) {
			primo = false;
		}
		while(i<numero && primo ==true) {
			if(numero % i==0) {
				primo=false;
			}
			i++;
		}
		while(i<=(int) Math.sqrt(numero) && primo==true) {
			
		}
		return (primo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero= teclado.nextInt();
		divisoresPrimos(numero);
	}

}

//> <
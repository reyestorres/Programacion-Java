package actividadesAplicacion;

import java.util.Scanner;

public class Actividad3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir un numero n y nos diga cuantos numeros hay entre 1 y n que sean primos.
		//un numero primo es divisible por 1 y por el mismo.
		Scanner teclado = new Scanner(System.in);
		int n, num=0;
		int i;
		boolean esPrimo=true;
			System.out.println("Introduce un numero: ");
			num=teclado.nextInt();
		for(n=1; n<=num;n++) {
			
		
			for(i=2;i<=n-1 && esPrimo; i++) {
				if(num % i==0 ) {
					esPrimo=false;

				} 
				if(esPrimo) {
					System.out.println("El numero: "+n+ " Es primo");
				} else {
					System.out.println("El numero: "+n+ " No es primo");
				}
				
			}
		}
			//System.out.println("Total de numeros primos: " +contador);
		
		
		
	}

}

package actividadesResueltas;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int datos[];
		int par[] = new int[0];
		int impar[] = new int [0];
		System.out.print("Escriba un numero: ");
		int n=teclado.nextInt();
		 datos = new int[n];
		 for(int i =0;i<datos.length;i++) {
			 System.out.println("Introduce un numero: ");
			 datos[i] = teclado.nextInt();
		 }
		 for(int numero:datos) {
			 if(numero %2 ==0) {
				 par=Arrays.copyOf(par, par.length+1);
				 par[par.length-1]=numero;
			 }else {
				 impar = Arrays.copyOf(impar, impar.length+1);
				 impar[impar.length-1]=numero;
			 }
			 
		 }
		 System.out.println("Pares: "+Arrays.toString(par));
		 System.out.println("Impares: " +Arrays.toString(impar));
	}
	

}

//> <
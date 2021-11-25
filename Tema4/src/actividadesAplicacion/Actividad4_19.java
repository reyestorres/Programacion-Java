package actividadesAplicacion;

import java.util.Scanner;

public class Actividad4_19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int cantidad;
		int rangoInferior;
		int rangoSuperior;
		System.out.println("Introduce la cantidad de numeros aleatorios: ");
		cantidad = teclado.nextInt();
		System.out.println("Introduzca el rango inferior: ");
		rangoInferior = teclado.nextInt ();
		System.out.println("Introduzca el rango superior: ");
		rangoSuperior = teclado.nextInt ();
		System.out.println("");
		mostrarAleatorios(cantidad, rangoInferior, rangoSuperior);
	}
	 static void mostrarAleatorios(int cantidad,int rangoInferior, int rangoSuperior) {
		int numAleatorio;
		for(int i=0; i<cantidad;i++) {
			numAleatorio= (int) (Math.random()*(rangoSuperior-rangoInferior+1)+rangoInferior);
			System.out.println(numAleatorio+ " ");

			
		}
	}
	 static void mostrarAleatorios (int cantidad) {
			int numAleatorio;
			
			for (int i=1; i<=cantidad; i++) {
				numAleatorio = (int)(Math.random());
				System.out.print(numAleatorio+" ");
			}
	 }

}

//> <
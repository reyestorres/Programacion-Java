package pack;

import java.util.Scanner;

public class Actividad1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear una aplicacion que calcule la media aritmetica de dos notas enteras. 
		//La media puede dar decimales
		int nota1;
		int nota2;
		double media;
		double suma;
		System.out.println("Introduce una nota: ");
		Scanner teclado = new Scanner(System.in);
		nota1 = teclado.nextInt();
		System.out.println("Introduce la segunda nota: ");
		nota2 = teclado.nextInt();
		suma = nota1+nota2;
		media = suma/2;
		System.out.println("La media es: " +media);
	
	}

}

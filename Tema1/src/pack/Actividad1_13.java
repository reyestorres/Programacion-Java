package pack;

import java.util.Scanner;

public class Actividad1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa que solicite las notas del primer, segundo y tercer trimestre(notas enteras que se solicitaran al usuario)
		//El programa debe mostrar la nota media del curso como se utiliza en el boletin de calificacions(solo la parte entera)
		//y como se usa en el expendiente academico(con decimales)
		int nota1;
		int nota2;
		int nota3;
		int mediaBoletin;
		double mediaExp;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce la nota del primer trimestre: ");
		nota1 = teclado.nextInt();
		System.out.println("Introduce la nota del segundo trimestre: ");
		nota2 = teclado.nextInt();
		System.out.println("Introduce la nota del tercer trimestre: ");
		nota3 = teclado.nextInt();
		mediaExp = (nota1 + nota2 + nota3) / 3.0;
		mediaBoletin = (int) mediaExp;
		System.out.println("Boletin de calificaciones: " + mediaBoletin);
		System.out.println("Expediente academico: " + mediaExp);
		
	}

}

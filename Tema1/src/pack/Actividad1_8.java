package pack;

import java.util.Scanner;

public class Actividad1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pedir al usuario su edad y luego decir si es mayor de edad o no
		int edad;
		System.out.println("Introduce tu edad: ");
		Scanner teclado = new Scanner(System.in);
		edad = teclado.nextInt();
		boolean mayorEdad = edad >=18;
		System.out.println("Si/no eres mayor de edad " +mayorEdad);
		
		
		
		
	}

}

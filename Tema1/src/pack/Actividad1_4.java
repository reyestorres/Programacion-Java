package pack;

import java.util.Scanner;

public class Actividad1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir una aplicacion que pida el año actual y el de nacimiento del usuario.
		//Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido a�os.
		
		int anioActual;
		int anioNac;
		int edad;
		System.out.println("Escribe el año actual: ");
		Scanner teclado = new Scanner(System.in);
		anioActual = teclado.nextInt();
		System.out.println("Escribe el año de nacimiento: ");
		anioNac = teclado.nextInt();
		edad = anioActual-anioNac;
		System.out.println("Tu edad es: " +edad);
		
		
		
		
	}

}

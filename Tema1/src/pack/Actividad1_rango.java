package pack;

import java.util.Scanner;

public class Actividad1_rango{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pedir el rango inferior y superior de un numero 
		//y a continuacion pedir un numero y para decir si pertenece a ese conjunto
		int rangoInferior;
		int rangoSuperior;
		int num;
		boolean conjunto;
		System.out.println("Introduce un rango inferior: ");
		Scanner teclado= new Scanner(System.in);
		rangoInferior = teclado.nextInt();
		System.out.println("Introduce un rango superior: ");
		rangoSuperior= teclado.nextInt();
		System.out.println("Introduce un numero: ");
		num= teclado.nextInt();
		conjunto =(num>=rangoInferior && num<=rangoSuperior);
		System.out.println("El numero esta en el rango: " +conjunto);
	
		
		
	}

}

package pack;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dise�ar una aplicacion que ayuda a contabilizar el numero de patas que tiene en total todos los animales
		//el numero de hormigas capturadas (6 patas)
		//el numero  de ara�as capturdas (8 patas)
		//el numero de cochinillas capturadas ((14 patas)
		//debe mostrar el numero total de patas
		int hormigas;
		int aranias;
		int cochinillas;
		int totalPatas;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce el numero de hormigas capturadas: ");
		hormigas = teclado.nextInt();
		System.out.println("Introduce el numero de aranias capturadas: ");
		aranias = teclado.nextInt();
		System.out.println("Introduce el numero de cochinillas capturadas: ");
		cochinillas = teclado.nextInt();
		hormigas = hormigas * 6;
		aranias = aranias * 8;
		cochinillas = cochinillas * 14;
		totalPatas = hormigas + aranias + cochinillas;
		System.out.println("El numero de patas de hormigas es: " + hormigas + " El numero de patas de aranias es: " 
		+ aranias + " El numero de patas de cochinillas es: " + cochinillas + " El numero total de todas las patas es: " +totalPatas);
		
		
	}

}

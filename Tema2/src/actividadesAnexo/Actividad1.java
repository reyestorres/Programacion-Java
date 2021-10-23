package actividadesAnexo;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int dia;
		System.out.println("Introduce un numero (dia de la semana) del 1 al 7: ");
		dia = teclado.nextInt();
		switch(dia%7) {
		case 0:
			System.out.println("DOMINGO");
			break;
		case 1: 
			System.out.println("LUNES");
			break;
		case 2 :
			System.out.println("MARTES");
			break;
		case 3 :
			System.out.println("MIERCOLES ");
			break;
		case 4 :
			System.out.println("JUEVES ");
			break;
		case 5 :
			System.out.println("VIERNES ");
			break;
		case 6 :
			System.out.println("SABADO");
			break;
		
			default : 
				System.out.println("Error no existe ese dia de la semana ");
			
		}
	}

}

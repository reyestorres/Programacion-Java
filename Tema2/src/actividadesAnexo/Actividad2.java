package actividadesAnexo;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int dia;
		String primerDiaMes;
		//realizar una suma
		System.out.println("Introduce un el dia de la semana que fue dia 1: ");
		primerDiaMes = teclado.next();
		System.out.println("Introduce un numero (dia de la semana): ");
		dia = teclado.nextInt();
		switch(primerDiaMes) {
			case "Martes":
				dia = dia + 1;
				break;
			case "Miercoles":
				dia = dia + 2;
				break;
			case "Jueves":
				dia = dia + 3;
				break;
			case "Viernes":
				dia = dia + 4;
				break;
			case "Sabado":
				dia = dia + 5;
				break;
			case "Domingo":
				dia = dia + 6;
				break;
			default:
				break;
		}
		
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

package actividadesResueltas;

import java.util.Scanner;

public class Actividad2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 7: ");
		int dia = teclado.nextInt();
		switch (dia) {
		case 1: 
			System.out.println("Lunes");
		case 2 :
			System.out.println("Martes");
		case 3 : 
			System.out.println("Miercoles");
		case 4 :
			System.out.println("Jueves");
		case 5 : 
			System.out.println("Viernes");
		case 6 :
			System.out.println("Sabado");
		case 7 :
			System.out.println("Domingo");
		default :
			System.out.println("Error: No existe un dia para ese numero");
		}
	}

}

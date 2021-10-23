package actividadesResueltas;

import java.util.Scanner;

public class Actividad2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int diasDelMes=0; //Aqui guardaremos el numero de dias que tiene el mes
		System.out.println("Introduzca un dia: ");
		int dia = teclado.nextInt();
		System.out.println("Introduzca un mes: ");
		int mes = teclado.nextInt();
		System.out.println("Introduzca un anio: ");
		int anio = teclado.nextInt();
		diasDelMes = switch(mes) {
			case 2 ->  28;
			case 4, 6, 9, 11 -> 30;
			default -> 31;
		};
		dia++; 
		if(dia > diasDelMes) {
			dia = 1;
			mes++;
			if (mes > 12) {
				mes = 1;
				anio++;
			}
		}
		if (anio ==0) {
			anio =1;
		}
		System.out.println(dia+"/"+mes+ "/" +anio);
	}

}

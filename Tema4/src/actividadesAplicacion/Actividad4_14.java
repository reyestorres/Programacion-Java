package actividadesAplicacion;

import java.util.Scanner;

public class Actividad4_14 {
	
	static void tiempo (int horas, int minutos, int dias) {
		int segundos;
		int minutosASegundos = minutos*60;
		int horasASegundos = horas*3600;
		int diasASegundos = dias*24*3600;
		segundos = minutosASegundos + horasASegundos + diasASegundos;
		System.out.println("Los segundos son: "+segundos);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca los dias: ");
		int dias = teclado.nextInt();
		System.out.print("Introduzca las horas: ");
		int horas = teclado.nextInt();
		System.out.print("Introduzca los minutos: ");
		int minutos = teclado.nextInt();
		tiempo(dias, horas, minutos);
	}

}

//> <
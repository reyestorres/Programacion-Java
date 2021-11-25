package actividadesAplicacion;

import java.util.Scanner;

public class Actividad4_15 {
	static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
		int minutos;
		int horasAMinutos1 = hora1*3600;
		int horasAMinutos2 = hora2*3600;
		int minutosAMinutos1 = minuto1*60;
		int minutosAMinutos2 = minuto2*60;
		minutos= horasAMinutos1 + horasAMinutos2 + minutosAMinutos1 + minutosAMinutos2;
		System.out.println("Los minutos son: "+minutos);
		return minutos;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca la primera hora: ");
		int hora1 = teclado.nextInt();
		System.out.print("Introduzca la segunda hora: ");
		int hora2 = teclado.nextInt();
		System.out.print("Introduzca los primeros minutos: ");
		int minuto1 = teclado.nextInt();
		System.out.print("Introduzca los segundos minutos: ");
		int minuto2 = teclado.nextInt();
		diferenciaMin(hora1, hora2, minuto1, minuto2);
	}

}

//> <
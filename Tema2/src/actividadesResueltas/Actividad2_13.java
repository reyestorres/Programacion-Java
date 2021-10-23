package actividadesResueltas;

import java.util.Scanner;

public class Actividad2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int h, m, s;
		System.out.println("Introduzca la hora: ");
		h = teclado.nextInt();
		System.out.println("Introduzca los minutos: ");
		m = teclado.nextInt();
		System.out.println("Introduzca los segundos: ");
		s = teclado.nextInt();
		s++; //incrementamos los segundos
		if (s > 59) { //si los segundos superan 59
			s =0; //los reiniciamos a 0
			m++; //e incrementamos los minutos
			if (m > 59)  { //si los minutos superan los 59
				m = 0; //los reiniciamos a 0
				h++; // e incrementamos las horas
				if (h > 23) { //si la hora supera 23
					h = 0; //reiniciamos la hora a 0
				}
			}
		}
		System.out.println("Hora + 1 segundo: " +h + ":" +m+ ":" +s);
	}

}

package actividadesAplicacion;

import java.util.Scanner;

public class Actividad3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3 do whiles para hora, minutos y segundos
		//en cuantos segundos se quiere incrementar la hora 
		//codigo para el incremento de esos segundos con un while
		//horas entre 0 y 23, minutos entre 0 y 60
		int horas;
		int minutos;
		int segundos;
		int contador=0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Introduce las horas: ");
			horas = teclado.nextInt();
		} while(horas >=0 && horas <=23 );
		do {
			System.out.println("Introduce los minutos: ");
			minutos = teclado.nextInt();
		} while(minutos >=0 && minutos <=60 );
		do {
			System.out.println("Introduce los segundos: ");
			segundos = teclado.nextInt();
		} while(segundos>=0);
		
		System.out.println("Cuantos segundos quieres aumentar? ");
		contador = teclado.nextInt();
		while (contador > 0) {
			segundos++;
			System.out.println(contador);
			contador--;
		}
		System.out.println("Las horas son: "+horas+ " Los minutos son: " +minutos+ " Y los segundos son: " +segundos);
	}

}

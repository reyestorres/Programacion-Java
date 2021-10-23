package pack;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Introduce una cantidad de segundos.
		//la aplicacion debe mostrar cuantas horas, minutos y segundos hay en el numero de segundos introducidos
		int segundosIntroducidos;
		int minutos;
		int horas;
		int segundos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una cantidad de segundos: ");
		segundosIntroducidos = teclado.nextInt();
		horas = segundosIntroducidos/3600;
		minutos = segundosIntroducidos%3600/60;
		segundos = segundosIntroducidos%60;
		System.out.println("El numero de horas es: " +horas+ " horas, el de minutos es: " +minutos+ " minutos y el de segundos: " +segundos +" segundos");
	}

}

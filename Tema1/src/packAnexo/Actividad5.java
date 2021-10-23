package packAnexo;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia_act, mes_act, anio_act;
		int dia_nac, mes_nac, anio_nac;
		boolean mayorEdad;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el dia actual: ");
		dia_act = teclado.nextInt();
		System.out.println("Introduce el mes actual: ");
		mes_act = teclado.nextInt();
		System.out.println("Introduce el año actual: ");
		anio_act = teclado.nextInt();
		System.out.println("Introduce el dia de nacimiento: ");
		dia_nac = teclado.nextInt();
		System.out.println("Introduce el mes de nacimiento: ");
		mes_nac = teclado.nextInt();
		System.out.println("Introduce el año de nacimiento: ");
		anio_nac = teclado.nextInt();
		mayorEdad = (anio_act - anio_nac >18) || ((anio_act - anio_nac ==18) &&(mes_act-mes_nac >0)) || ((anio_act - anio_nac ==18)&&(mes_act - mes_nac ==0)&&(dia_act - dia_nac >=0));
		System.out.println("¿Eres mayor de edad?: " +mayorEdad);
		
	}

}

package actividadesAplicacion;

import java.util.Scanner;

public class Actividad2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribe una aplicacion que solicite al usuario un numero comprendido entre 0 y 9999.
		//La aplicacion tendra que indicar si el numero introducido es capicua
		Scanner  teclado = new Scanner(System.in);
		int num;
		int numDelReves=0;
		System.out.println("Introduce un numero de 4 cifras del 0 al 9999: ");
		num = teclado.nextInt();
		int capicua = num;
		if (num >=1000 && num <=9999) {
			numDelReves +=(num%10)*1000;
			num=num/10;
			numDelReves +=(num%10)*100;
			num=num/10;
			numDelReves +=(num%10)*10;
			num=num/10;
			numDelReves +=(num%10);
			if(capicua == numDelReves) {
				System.out.println("El numero es capicua");
			}else {
				System.out.println("El numero no es capicua");
			}
		} else {
			System.out.println("Parametro no correcto");
		}
			//int u = num%10; num /=10; int d = num%10; num /=10; int c = num%10; num/=10; int um = num;
		/*if () {
		 capicua = true;
		 } else if () {
		 	capicua = true;
		 } else if () {
		 capicua = true; 
		 } else if () {
		 capicua = true;
		 }
		 if(capicua) {
		 	System.out.println("El numero es capicua");
		 	} else {
		 	System.out.println("El numero no es capicua");
		 	}
		 */
	}

}

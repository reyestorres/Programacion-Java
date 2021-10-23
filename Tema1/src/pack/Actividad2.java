package pack;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12+2=14, 2+5=7, 13+1=14, 4+3=7, 10+11=21, 12+9=21, 15+13=28, 6+29=35
		//meter un numero por teclado que no sea multiplo de 7 y que me de el multiplo de 7
		//si meto el numero 13 el resultado que me debe dar es 1 porque luego el siguiente es 14 multiplo de 7
		//utilizar el operador modulo
		
		int num;
		int suma;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un numero: ");
		num = teclado.nextInt();
		suma = 7 - num % 7;
		suma = (suma==7 ? 0 : suma);
		System.out.println("La suma es: " + suma);
		 
	}

}

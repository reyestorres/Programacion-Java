package actividadesPropuestas;

import java.util.Scanner;

public class ActividadPositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer un numero entero positivo (mayor que cero) y sumar todos los numeros que hay entre el 1 y ese numero
		//mientras que el numero sea mayor o igual que cero hay que pedir otra vez el dato
		int num;
		int contador = 1;
		int suma=0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Introduce un numero positivo: ");
			num = teclado.nextInt();
		} while(num <=0);
		while (contador <=num) {
			System.out.println(contador);
			suma+=contador;
		contador ++;
		}
		System.out.println("Suma: " +suma );
	}

}

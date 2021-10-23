package actividadesResueltas;

import java.util.Scanner;

public class Actividad3_3 {

	public static void main(String[] args) {
		/*Codificar el juego "el numero secreto", que consiste en acertar un numero entre 1 y 100(generado aleatoriamente)
		 * Para ello se introduce por teclado una serie de numeros, para los que se indica: ""mayor o menor", segun sea mayor o mejor
		 * con respecto al numero secreto. El proceso termina cuando el usuario acierta o cuando se rinde
		 * (introduciendo un -1).*/
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numSecreto = (int) (Math.random() *100+1); //numero aleatorio entre 1 y 100
		System.out.println("Introduzca un numero entre 1 y 100: ");
		int num = teclado.nextInt();
		while (numSecreto != num && num !=-1) //mientras no acertamos son distintos y no introduzcamos -1
		{
			if(numSecreto < num) {
				System.out.println("El numero secreto es mayor");
			}else {
				System.out.println("El numero secreto es menor");
			}
			System.out.println("Introduzca otro numero ");
			num = teclado.nextInt();
			
		}
		if(numSecreto == num) {
			System.out.println("Enhorabuena...");
		} else {
			System.out.println("Otra vez sera...");
		}
	}

}

package actividadesResueltas;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_6 {
	static int  primitiva(int apuesta[], int [] combinacionGanadora) {
		int aciertos=0;
		for(int a:apuesta) {
			if(Arrays.binarySearch(combinacionGanadora, a)>=0) {
				aciertos++;
			}
		}
		return (aciertos);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado = new Scanner(System.in);
			int combinacionGanadora[] = {1,4,6,2,0,3,8};
			System.out.println(Arrays.toString(combinacionGanadora)); 
			System.out.println("Escriba un numero de la primitiva: "); 
			int apuesta = teclado.nextInt();
			//int indice [] = primitiva(apuesta, combinacionGanadora);
			System.out.println("El numero intrododucido de la apuesta " +apuesta+ " se encuentra en la primitiva"); 
			//System.out.println(Arrays.toString(indice)); 
	}

}

//> <
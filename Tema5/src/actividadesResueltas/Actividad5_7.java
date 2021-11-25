package actividadesResueltas;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_7 {
	static int[] sinRepetidos(int t[]) {
		int temporal[] = new int[0];
		for(int elemento:t) {
			if(buscar(temporal, elemento) == 1) {
				temporal = Arrays.copyOf(temporal, temporal.length+1);
				temporal[temporal.length-1]=elemento;
			}
		}
		return temporal;
	}
		static int buscar(int temporal[], int elemento) {
			int i=0;
			while(i<temporal.length && temporal[i] !=elemento) {
				i++;
			}
			if(i<temporal.length) {
				System.out.println("Se encuentra en " +i+ " posicion");
			}else {
				System.out.println(-1); //debo devolver -1
			}
			return i;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int temporal []= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 3, 4, 5, 56, 56, 21, 20, 21, 9, 8, 14, 1, 14};
		System.out.println("Inserte un numero: ");
		int t = teclado.nextInt();
		System.out.println(Arrays.toString(temporal));
		sinRepetidos(temporal);
		
	
	
		
	}

}

//> <
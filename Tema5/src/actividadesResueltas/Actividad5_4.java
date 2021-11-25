package actividadesResueltas;

import java.util.Scanner;

public class Actividad5_4 {
	static int maximo(int t[]) {
		int max= t[0];
		for(int e:t) {
			if(e>max) {
				max = e;
			}
			
		}
		return (max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t[] = {2, 8, 1 , 14, 10, 100};
		int solucion = maximo(t);
		System.out.println("La solucion es: " + solucion);
	}
}

//> <
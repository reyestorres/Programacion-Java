package actividadesResueltas;

import java.util.Arrays;

public class Actividad5_5 {
	static int[] rellenaPares(int longitud, int fin){
		int pares[]= new int [longitud];
		int i=0;
		while (i<pares.length) {
			int num =(int) (Math.random()*fin +1);
			if(num % 2 == 0) {
				pares[i] =num;
				i++;
			}
		}
		Arrays.sort(pares);
		return (pares);
	}
	
	static void imprimeArray(int[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longitud = 10;
		int fin=300;
		int[] solucion = rellenaPares(longitud, fin);
		imprimeArray(solucion);
	}

}

//> <
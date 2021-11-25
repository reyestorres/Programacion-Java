package actividadesAplicacion;

import java.util.Arrays;

public class Actividad5_12 {
	static void desordenar(int t[]) {
		int aux;
		int numAleatorio;
		for(int i=0;i<t.length;i++) {
			numAleatorio = (int) (Math.random()* t.length);
			aux=t[numAleatorio];
			t[numAleatorio]=t[i];
			t[i] = aux;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aux[] = new int[10];
		aux[0] = 1;
		aux[1] = 2;
		aux[2] = 3;
		aux[3] = 4;
		aux[4] = 5;
		aux[5] = 6;
		aux[6] = 7;
		aux[7] = 8;
		aux[8] = 9;
		aux[9] = 10;
		System.out.println(Arrays.toString(aux)); 
		desordenar(aux);
		System.out.println(Arrays.toString(aux)); 
	
	}

}

//> <
package actividadesAplicacion;

import java.util.Arrays;

public class Actividad5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aux [] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(aux)); 
		int[] solucion =desordenar(aux);
		System.out.println("---");
		System.out.println(Arrays.toString(aux)); 
		System.out.println(Arrays.toString(solucion)); 
		
	}
	static int[] desordenar(int t[]) {
		int[] arrayCopy = Arrays.copyOf(t, t.length);
		int aux;
		int numAleatorio;
		for(int i=0;i<arrayCopy.length;i++) {
			numAleatorio = (int) (Math.random()* arrayCopy.length);
			aux=arrayCopy[numAleatorio];
			arrayCopy[numAleatorio]=arrayCopy[i];
			arrayCopy[i] = aux;
			
		}return arrayCopy;
		
	}

}

//> <
package actividadesResueltas;

import java.util.Arrays;

public class Actividad5_10 {
	public static int[] eliminarMayores(int t[], int valor) {
		return t;
		
	}
	static  int[] sinMayores(int t[],int valor) {
		int copia[] = Arrays.copyOf(t, t.length);
		int i=0;
		while(i<copia.length) {
			if(copia[i]> valor) {
				copia[i]=copia[copia.length-1];
				copia = Arrays.copyOf(copia, copia.length-1);
			}else 
				i++;
		}
		return copia;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//> <
package actividadesPropuestas;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadPropuesta5_7 {
	static int borrado(int [] t, int aBorrar) {
		int indiceBorrado;
		indiceBorrado =Arrays.binarySearch(t,  aBorrar);
		if(indiceBorrado>=0 ) {
			System.arraycopy(t, indiceBorrado+1, t, indiceBorrado, t.length - indiceBorrado-1);
			t = Arrays.copyOf(t, t.length -1);
			System.out.println(Arrays.toString(t));
		}
	
		return indiceBorrado;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int t[]= new int[7];
		int numFav;
		int numSuerte;
		int aBorrar;
		int media;
		for(int i=0;i<7;i++) {
			System.out.println("Introduce tus siete numeros favoritos: ");
			numFav=teclado.nextInt();
			t[i] = numFav;
		}
		System.out.println("Tus numeros favoritos son: "+Arrays.toString(t));	
		//Eliminar dos numeros al azar de la lista de numeros favoritos
		numFav = (int) (Math.random()*2);
		System.out.println(numFav);
		//media de los dos eliminados a la lista de numeros
		
		
		
		
	/*	
		System.out.println("El numero eliminado es: "+aBorrar);
		borrado(t, aBorrar);*/
	
	}

}

//> <
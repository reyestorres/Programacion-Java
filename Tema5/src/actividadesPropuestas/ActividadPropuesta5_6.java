package actividadesPropuestas;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadPropuesta5_6 {
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
		int aBorrar;
		int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Introduce el numero a eliminar de la tabla: " +Arrays.toString(t)+ " :");
		aBorrar = teclado.nextInt();
		System.out.println("El numero eliminado es: "+aBorrar);
		borrado(t, aBorrar);
	
		
		
		
	}

}

//> <
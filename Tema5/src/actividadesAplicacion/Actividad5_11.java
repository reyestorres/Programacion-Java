package actividadesAplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_11 {
	public static int[] buscarTodos(int t[], int clave) {
		int encontrado[] = new int[0];
		int i;
		for(i=0;i<t.length;i++) {
			if(t[i] ==clave) {
				encontrado = Arrays.copyOf(encontrado, encontrado.length +1);
				encontrado[encontrado.length-1]=i;
			}
		}
		
		return encontrado;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner teclado = new Scanner(System.in);
		int aux[] = {1, 2, 3, 1, 2, 3, 1, 2, 3, 4};
		System.out.println(Arrays.toString(aux)); 
		System.out.println("Escriba un numero del 1 al 5: "); 
		int aBuscar = teclado.nextInt();
		int indice [] = buscarTodos(aux, aBuscar);
		System.out.println("El numero " +aBuscar+ " se encuentra en los indices"); 
		System.out.println(Arrays.toString(indice)); 
	}

}

//> <
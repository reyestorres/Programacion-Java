package actividadesAnexo;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear un vector tamaño 10 con valores aleatorios entre 0 y 100. Pedir por teclado un
		número de posiciones que se desea rotar dicho vector hacia la izquierda.El primer
		elemento pasará a la última posición.*/
		Scanner teclado= new Scanner(System.in);
		int vector[] = new int[10];
		int pos;
		int i;
		int j;
		for(i=0;i<10;i++) {
			vector[i] = (int)(Math.random()*100);
			System.out.print("["+vector[i]+"]");
		}
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Cuantas posiciones deseas rotar el vector?: ");
		pos=teclado.nextInt();
			for(j=0;j<pos;j++) {
				//roto el vector j veces
				rotar(vector);
			}
			
			System.out.println("Vector rotado: "+ Arrays.toString(vector));
		
	}
	public static int[] rotar(int[] vector){
		//Guardamos en una variable auxiliar el ultimo numero porque se va a sobrescribir
		int aux = vector[0];
		int i;
		//remplazo la posicion i con i-1
		for(i= 0; i<vector.length-1; i++) {
			vector[i] = vector[i+1];
		}
		//Remplazo la posicion 0 con lo que tenia en el auxiliar
		vector[i]= aux;
		return vector;
	}
}

//> <
package actividadesAnexo;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear un vector tamaño 20 con valores aleatorios entre 0 y 10. Pedir por teclado dos
		números y sustituir el primero por el segundo.*/
		Scanner teclado= new Scanner(System.in);
		int num1;
		int num2;
		int vector[]=new int[20];
		for(int i=0;i<20;i++) {
			vector[i]=(int) (Math.random()*10);
			System.out.print("["+vector[i]+"]");
		}
		System.out.println();
		System.out.println("Introduce el primer numero: ");
		num1=teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		num2=teclado.nextInt();
		
		sustituir(vector,num1,num2);
		
		
		System.out.println("Posiciones cambiadas: "+ Arrays.toString(vector));

	}
		public static void sustituir(int vector[], int pos1, int pos2) {
			if(pos2 < vector.length && pos1 < vector.length
					&& pos2 >= 0 &&  pos1 >= 0 ) {
				int aux = vector[pos1];
				vector[pos1] = vector[pos2];
				vector[pos2] = aux;	
			}else {
				System.out.println("Posiciones incorrectas");
			}
		}

}

//> <
package actividadesResueltas;

import java.util.Scanner;

public class Actividad3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso
		Scanner teclado = new Scanner(System.in);
		int notas;
		boolean suspensos = false;
		for(int i =0;i<5;i++) {
			System.out.println("Introduce una nota del 0 al 10: ");
			 notas = teclado.nextInt();
			if(notas<5) {
				suspensos = true;
			} 
		} if (suspensos) {
				System.out.println("Si hay alumnos suspensos");
			}else {
				System.out.println("No hay suspensos");
			}
		}

}

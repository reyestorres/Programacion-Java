package actividadesResueltas;

import java.util.Scanner;

public class Actividad3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dada 6 notas, escribir la cantidad de alumnos aprobados, condicionados(nota igual a cuatro) y suspensos
		Scanner teclado = new Scanner(System.in);
		int aprobados =0;
		int suspensos =0;
		int condicionados =0;
		int nota;
		for(int i =0; i <6;i++) {
			System.out.println("Nota del alumno " +i+":");
			nota = teclado.nextInt();
			if(nota ==4) {
				condicionados++;
			}else if( nota >=5) {
				aprobados++;
			} else {
				suspensos++;
				System.out.println("Suspenso");
			}
		}
		System.out.println("Aprobados: " +aprobados);
		System.out.println("Condicionados: " +condicionados);
		System.out.println("Suspensos: " +suspensos);
	}

}

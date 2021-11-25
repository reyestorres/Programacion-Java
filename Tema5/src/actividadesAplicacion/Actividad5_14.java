package actividadesAplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int encuestas[]= new int [0];
		int sueldos = 0;
		
		while(sueldos !=-1) {
			System.out.println("Hola buenas tardes, vengo a hacerle una encuesta. Cual es su sueldo?: ");
			sueldos=teclado.nextInt();
		}
		Arrays.copyOf(encuestas, encuestas.length);
		for(int i=0;i<encuestas.length;i++) {
			encuestas[i]=sueldos;
			System.out.println(Arrays.toString(encuestas));
		}
		
		Arrays.sort(encuestas);
		//int max=sueldoMax(sueldos);
		//int min=sueldoMin(sueldos);
		//int media=media(sueldos);
		System.out.println("Sueldos ordenados: "+ Arrays.toString(encuestas));
		System.out.println("Sueldo maximo: " );
		System.out.println("Sueldo minimo: ");
		System.out.println("La media de los sueldos es: ");
		
		
		
	}
	
	//el sueldo maximo y minimo
	static int sueldoMax(int sueldos[] ) {
		int max= sueldos[0];
		for(int s:sueldos) {
			if(s>max) {
				max = s;
			}
			
		}
		return max;
	}
	static int sueldoMin(int sueldos[] ) {
		int min= sueldos[0];
		for(int s:sueldos) {
			if(s<min) {
				min = s;
			}
			
		}
		return min;
		
	}
	//la media de los sueldos
	static double media(int sueldos[]) {
		double media=sueldos[0];
		for(int m:sueldos) {
			media = media + sueldos[m];
			media = media/sueldos.length;
		}
		return media;
		
	}

}

//> <
package actividadesResueltas;

import java.util.Scanner;

public class Actividad3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Diseñar un programa que muestre la suma de los 10 primeros numeros impares
		double suma =0;
		int impar;
		for(int i=1; i <=10; i++) {
			impar =2 *i -1;
			System.out.println("Numero impar: "+impar);
			suma = suma + impar;
		}
		System.out.println("La suma de los 10 primeros impares es: " +suma);
	}

}

package actividadesPropuestas;

import java.util.Scanner;

public class ActividadPropuesta5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n=0;
		int i;
		int suma=0;
		int media=0;
		int contadorPositivo=0;
		int contadorNegativo=0;
		int contadorCero=0;
		System.out.println("Introduce un numero: ");
		 n = teclado.nextInt();
		 int num[]= new int[n];
		 for(i=0; i<num.length;i++) {
				System.out.println("Introduce " +n+" numeros(positivos y negativos): ");
				num[i] = teclado.nextInt();
		 }
		 if(num[i] > 0) {
			 contadorPositivo++;
		 }else if (num[i]<0) {
			 contadorNegativo++;
		 }else {
			 contadorCero++;
		 }
		 System.out.println("El numero de positivos son: " +contadorPositivo);
		 System.out.println("El numero de negativos son: " +contadorNegativo);
		 System.out.println("El numero de ceros es: " +contadorCero);
		/* int suma = 0;
			for(int valor:num) {
				suma+=valor;
			}
			System.out.println("La suma de los numeros es: " +suma);
		 int media = 0;
			for(int valor:num) {
				media= suma/10;
			}
			System.out.println("La media de los numeros es: " +media);*/
	}

}

//> <
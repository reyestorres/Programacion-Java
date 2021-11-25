package actividadesAnexo;

import java.util.Arrays;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crea tres arrays de 20 números enteros cada uno, con nombres: numero ,cuadrado
		y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
		cuadrado se deben almacenar los cuadrados de los valores de la misma posición
		que hay en el array numero. En el array cubo se deben almacenar los cubos de los
		valores que hay en numero. A continuación, muestra el contenido de los tres arrays
		dispuestos en tres columnas.*/
		int numero[] = new int [20];
		int cuadrado[] = new int[20];
		int cubo[] = new int [20];
		int i;
		System.out.println("|Numero aleatorio | Cuadrado | Cubo |");
		for ( i = 0; i <20; i++) {
			numero[i] = (int) (Math.random() * 100);
			cuadrado[i] = numero[i] * numero[i];
			cubo[i] = cuadrado[i] *numero[i];
			System.out.println("------------------|----------|--------");
			  System.out.printf("%10d  %13d  %9d%n", numero[i], cuadrado[i], cubo[i]);
		
			}
	
		
		
		
		
	}

}

//> <
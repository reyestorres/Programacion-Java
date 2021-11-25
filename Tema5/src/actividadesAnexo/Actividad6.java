package actividadesAnexo;

import java.util.Arrays;

public class Actividad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dado un vector de números enteros, escriba un método que ordene los elementos
		del vector de tal forma que los números pares aparezcan antes que los números
		impares. Además, los números pares deberán estar ordenados de forma
		ascendente, mientras que los números impares deberán estar ordenados de forma
		descendente. Esto es, el vector {1,2,3,4,5,6} quedará como {2,4,6,5,3,1}*/
		int vector[]= {1,2,3,4,5,6};
		int pares[]=new int[0];
		int impares[]= new int[0];
		ordenar(vector);
		System.out.println("Vector ordenado: "+Arrays.toString(vector));;
		
	}
	static int ordenar(int vector[]) {
		for(int i=0;i<vector.length;i++) {
			for(int v:vector) {
				if(v %2==0) {
					Arrays.sort(vector);
				}
			}
			
		
		}
		
		return 0;
		
	}

}

//> <
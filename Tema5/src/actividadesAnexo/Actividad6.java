package actividadesAnexo;

import java.util.Arrays;

public class Actividad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dado un vector de n�meros enteros, escriba un m�todo que ordene los elementos
		del vector de tal forma que los n�meros pares aparezcan antes que los n�meros
		impares. Adem�s, los n�meros pares deber�n estar ordenados de forma
		ascendente, mientras que los n�meros impares deber�n estar ordenados de forma
		descendente. Esto es, el vector {1,2,3,4,5,6} quedar� como {2,4,6,5,3,1}*/
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
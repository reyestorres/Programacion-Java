package actividadesPropuestas;

import java.util.Arrays;
import java.util.Scanner;

public class ProyectoVectorOrdenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int opc = 0;
		int nElemento = 0;
		int valor=0;
		int vector[] = new int[10];
		do {
			main();
			opc=leerOpcion();
			switch (opc){
			case 1:
				for(int i=1;i<=10;i++) {
					 valor = (int) (Math.random()*100+1);
					rellenar(vector,valor);
					nElemento=vector.length;
				}
			
			break;
			case 2: ordenar(vector, nElemento);
			break;
			case 3: busquedaElemento(vector, valor, nElemento);
					
				break;
	
			case 4 : listado(vector, nElemento);
			break;
			case 5:
				break;
			case 6:  eliminar(vector, valor);
				break;
			default:
				break;
			}
		}while(opc !=7);
		
	}
	
		private static void ordenar(int[]vector, int nElemento) {
			for(int i=0;i<nElemento;i++) {
				for(int j=0;j<nElemento;j++) {
					if(vector[j]>vector[i]) {
						int aux=vector[i];
						vector[i]=vector[j];
						vector[j]=aux;
					}
				}
			}
			//ordenar = true;
			Arrays.sort(vector);
			
		}
	 private static void listado(int[] vector, int nElemento) {
			for(int i=0;i<nElemento;i++) {
				System.out.println("Listado del vector: "+vector[i]);
			}
			  System.out.println();
		

		}
		private static void rellenar(int[] vector, int valor) {
			// TODO Auto-generated method stub
			for(int i=0;i<vector.length;i++) {
				vector[i]=valor;
			}
		}
		private static void eliminar(int[]vector, int valor) {
			int indiceBorrado = 0;
			if (indiceBorrado !=1) {
				vector[indiceBorrado] = vector[vector.length -1];
				vector= Arrays.copyOf(vector, vector.length-1);
				System.out.println(Arrays.toString(vector));
						
			}else {
				//no se borra nada
			}
		}
		private static int busquedaElemento(int[]vector, int valor, int nElemento) {
			int inicio=0;
			int fin= nElemento-1;
			int pos;
			while(inicio<=fin) {
				pos = (inicio+fin)/2;
				if(vector[pos]==valor) 
					return pos;
				else if (vector[pos] < valor) {
					inicio =pos+1;
				}else {
					fin=pos-1;
				}
			}
			Arrays.binarySearch(vector, fin);
			return -1;
	}
		private static int leerOpcion() {
			// TODO Auto-generated method stub
			Scanner teclado= new Scanner(System.in);
			int opcionValida = 0;
			do {
				System.out.println("Elige una opcion: ");
				opcionValida=teclado.nextInt();
			}while(opcionValida<1 || opcionValida >7);
			return opcionValida;
		}
	
	private static void main() {
		System.out.println("1.Rellenar tabla"); //rellenar tabla entera
		System.out.println("2.Ordenar"); //con sort
		System.out.println("3.Busqueda de un elemento");//con el binary search
		System.out.println("4.Listar elementos");  //con toString
		System.out.println("5. Insertar nuevo elemento");
		System.out.println("6.Eliminar un elemento");
		System.out.println("7.Salir");
		
	}

}

//> <
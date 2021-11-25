package actividadesPropuestas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ActividadElemento {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int opc = 0;
		int valor=0;
		int nElemento = 0;
		int vector[] = new int[10];
		do {
			main();
			opc=leerOpcion();
			switch (opc){
			case 1: nElemento = insertarElemento(vector, nElemento);
			break;
			case 2:
				System.out.println("Introduzca el valor: ");
				 valor= teclado.nextInt();
				rellenar(vector,valor);
				nElemento=vector.length;
			break;
			case 3: 
				System.out.println("Introduzca el valor: ");
				valor= teclado.nextInt();
				System.out.println("Introduzca el indice inicial: ");
				int indice= teclado.nextInt();
				System.out.println("Introduzca el indice final: ");
				int indiceFinal= teclado.nextInt();
				if(nElemento>=indiceFinal || nElemento>=indice) {
					rellenarParte(vector,indice,indiceFinal,valor);
					if(nElemento<=indice)
						nElemento=indiceFinal;
				} else 
					System.out.println("NO SE PUEDE REALIZAR: LIMITES INVALIDOS.");
				
					
				break;
			case 4 : listado(vector, nElemento);
			break;
			case 5: ordenar(vector, nElemento);
				break;
			case 6: busquedaElemento(vector, valor, nElemento);
				break;
			case 7: busquedaSec(vector, valor, nElemento);
				break;
			default:
				break;
			}
		}while(opc !=8);
		
	}
	
		private static void rellenarParte(int[] vector, int indice, int indiceFinal, int valor) {
		// TODO Auto-generated method stub
			Arrays.fill(vector, indice, indiceFinal, valor);
			for(int i=indice;i<=vector.length;i++) {
				vector[i]=valor;
			}
	}
		
	private static void rellenar(int[] vector, int valor) {
		// TODO Auto-generated method stub
		for(int i=0;i<vector.length;i++) {
			vector[i]=valor;
		}
	}
	


    private static int insertarElemento(int[] vector, int nElementos) {
        // TODO Auto-generated method stub
        Scanner cs = new Scanner(System.in);
        int nuevoElemento = 0;
        System.out.println("Introduce nuevo elemento:");
        nuevoElemento = cs.nextInt();

        if (vector.length > nElementos) {
            vector[nElementos] = nuevoElemento;
            nElementos++;
        } else {
            System.out.println("El vector esta lleno");
        }

        System.out.println();
        return nElementos;
    }
	private static void listado(int[] vector, int nElemento) {
		for(int i=0;i<nElemento;i++) {
			System.out.println("Listado del vector: "+vector[i]);
		}
		  System.out.println();
	

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
	 private static int busquedaSec(int[] vector, int valor, int nElemento) {
		 boolean encontrado=false;
				 int i;
		 for(i=0;i<nElemento;i++) {
			 if(vector[i]==valor) 
				 encontrado=true;
			 
		 }
		 if(encontrado)
			 return i-1;
		 else return -1;
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
			return -1;
			//Arrays.binarySearch(vector, valor);
	} 
	private static int leerOpcion() {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int opcionValida = 0;
		do {
			System.out.println("Elige una opcion: ");
			opcionValida=teclado.nextInt();
		}while(opcionValida<1 || opcionValida >8);
		return opcionValida;
	}
	private static void main() {
		System.out.println("1.Insertar elemento");
		System.out.println("2.Rellenar una tabla");
		System.out.println("3.Rellenar una parte de la tabla");
		System.out.println("4.Listar elementos");
		System.out.println("5.Ordenar");
		System.out.println("6.Busqueda de un elemento");
		System.out.println("7.Busqueda secuencial de un elemento");
		System.out.println("8.Salir");
		
	}

}

//> <
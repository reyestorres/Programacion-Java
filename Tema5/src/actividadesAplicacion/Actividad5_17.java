package actividadesAplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner (System.in);
		int t[];
		int tabla[];
		int nEl, numV, i, sup, inf;
		
		do {
			System.out.print("Indica el tamaño del vector (rango 1-10): ");
			numV = sc.nextInt ();
			
			if (numV<1 || numV>10) {
				System.out.println("  << ¡Dije en el rango 1-10! >>               ");
			} 
			
		} while (numV<1 || numV>10);
		t = new int [numV];
		System.out.println("");
		
		System.out.print("Introduce el rango superior: ");
		sup = sc.nextInt ();
		System.out.print("Introduce el rango inferior: ");
		inf = sc.nextInt ();
		
		for	(i=0; i<t.length; i++) {	
			t[i] = (int) (Math.random()*sup+inf);	
		}
		
		System.out.println("");
		System.out.print("¿En cuanto quieres agruparlo?:  ");
		nEl = sc.nextInt ();
		
		System.out.println("");
		System.out.println(Arrays.toString(t));
		System.out.println("");
		
		tabla = new int [(t.length-nEl)+1];
		tabla=suma (t, nEl);
		
		System.out.println(Arrays.toString(tabla));
	}

	static int[] suma (int t[], int nEl) {
		int i, j, k, l, suma, cont;
		int tablaSuma[] = new int [0]; 
		
		for (i=0; i<=t.length-nEl; i++) { 
			suma=0; 
			
			for (j=0; j<nEl; j++) { 
				// System.out.print(suma+"+"+t[i+j]+" ");
				suma=suma+t[i+j];
				/* System.out.print("suma: "+suma+" ");
				System.out.println(""); */
			
			}
				tablaSuma = Arrays.copyOf(tablaSuma, tablaSuma.length+1);
				tablaSuma [i]= suma; 
		}
		
		return tablaSuma; 
		
		}

}

//> <
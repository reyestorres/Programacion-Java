package actividadesAplicacion;

import java.util.Arrays;

public class Actividad5_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* tabla1: 1 3 11 44 66 93
		tabla2: 2 3 14 24 44 88

		la i vale 0 y la j 0, tenemos 3 casos que sea menor, mayor o igual. cogemos el elemento menor 
		y lo insertamos en la tabla fusion, en este caso cogerá la i. aumentamos la i en 1 y la k tambien
		ahora cual es menor ahora la j es menor, aumentamos la i en 1 y la k tambien. ahora son iguales aumentamos los dos
		i=0 i=1 i=3 i=4 i=5
		j=0 j=1 j=2 j=3 j=4 j=5
		
		tablaFusion:  1 2 3 11 14 24 44 66 88 
					k=0 k=1 k=2 k=3 k=4 k=5 k=6 k=7 k=8
				while(i <tabla1.length && j<tabla2.length) {
				Arrays.copyOf();
				if(comparar tabla de i y tabla de j< )
				else if ( >)
				else
				=
			}
			//Tratamiento de cola		
			 while(i<tabla1.length) {
			 Arrays.copyOf();
			 tablaFusion[k]=tabla1[i];
			 k++;
			 i++;
			 }
			 while(j<tabla2.length) {
			 Arrays.copyOf();
			  tablaFusion[k]=tabla2[j];
			 k++;
			 j++;
			 }
		*/
		int tabla1[]= {1, 3, 11, 44, 66, 93};
		int tabla2[]= {2, 3, 14, 24, 44, 88};
		int tablaFusion[] = new int [12];
		int i = 0;
		int j=0;
		int k=0;
	
		
		while(i <tabla1.length && j<tabla2.length) {
			Arrays.copyOf(tabla1, tabla1.length);
			Arrays.copyOf(tabla2,tabla2.length);
		
			if( tabla1[i]<tabla2[j]) {
			
				System.out.println("La tabla 1 es menor que la tabla 2");	
			}else if (tabla1[i]>tabla2[j]){
				
				System.out.println("La tabla 1 es mayor que la tabla 2");	
			}else {
			
				System.out.println("Las dos tablas son iguales");	
			}
			
			
		}
		
		//Tratamiento de cola	
		 while(i<tabla1.length) {
		Arrays.copyOf(tabla1, tabla1.length);
		 tablaFusion[k]=tabla1[i];
		 
		 k++;
		 i++;
		 }
		 while(j<tabla2.length) {
		Arrays.copyOf(tabla2, tabla2.length);
		 tablaFusion[k]=tabla2[j];
		 k++;
		 j++;
		 }
		 Arrays.sort(tablaFusion);
		Arrays.toString(tablaFusion);
		
	}

}


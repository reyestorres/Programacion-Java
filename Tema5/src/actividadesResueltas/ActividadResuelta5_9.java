package actividadesResueltas;


import java.util.Arrays;
import java.util.Scanner;

public class ActividadResuelta5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int puntos[] = new int [5];
		for(int i=0;i<5;i++) {
			System.out.println("Puntos programdor ("+ (i+1) +"): ");
			puntos[i]=teclado.nextInt();
		}
		Arrays.sort(puntos);
		System.out.println("Puntacion: " +Arrays.toString(puntos));
		System.out.println("Puntos del programador de exhibicion: " );
		int puntosProgEx=teclado.nextInt();
		while(puntosProgEx !=-1) {
			int pos=Arrays.binarySearch(puntos, puntosProgEx);
			int indiceInsercion;
			if(pos<0) {
				indiceInsercion=-pos -1;
			}else {
				indiceInsercion=pos;
			}
			int copia[] = new int[puntos.length+1];
			System.arraycopy(puntos, 0, copia, 0, indiceInsercion);
			System.arraycopy(puntos, indiceInsercion,copia,indiceInsercion+1, puntos.length-indiceInsercion);
			copia[indiceInsercion]=puntosProgEx;
			puntos=copia;
			System.out.println("Puntos del programador de exhibicion: " );
			puntosProgEx = teclado.nextInt();
		}
		
		System.out.println("Puntuacion final: " +Arrays.toString(puntos));
	}


}

//> <
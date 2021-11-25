package actividadesResueltas;

import java.util.Arrays;

public class EjemploPag146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int nuevo=5;
		int indiceInsercion = Arrays.binarySearch(t, nuevo);
		if(indiceInsercion<0) {
			indiceInsercion = indiceInsercion -1;
		}
		int copia[] = new int[t.length+1];
		System.arraycopy(t, 0, copia, 0, indiceInsercion);
		System.arraycopy(t, indiceInsercion, copia, indiceInsercion+1, t.length - indiceInsercion);
		copia[indiceInsercion]=nuevo;
		t=copia;
		System.out.println(Arrays.toString(t));
	}

}

//> <
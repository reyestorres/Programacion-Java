package actividadesResueltas;

import java.util.Scanner;

public class Actividad3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Un centro de investigacion de la flora urbana necesita una aplicacion que muestre la cual es
		 * el arbol mas alto. Para ello se introducira por teclad la altura(en centimetros) de cada
		 * arbol (terminando la introducion de datos cuando utilice -1 como altura). Los arboles se identifican
		 * mediantre etiquetas con numeros unicos correlatios, comenzando en 0. 
		 * Diseñar una aplicacion que resuelva el problema planteado*/
		
		Scanner teclado = new Scanner(System.in);
		int etiquetaArbolMasAlto; //numero identificativo del arbol mas alto
		int alturaArbolMasAlto; //altura del arbol mas alto
		int etiqueta = 0;
		int altura;
		System.out.println("Altura del arbol ("+ etiqueta +"): ");
		altura = teclado.nextInt();
		alturaArbolMasAlto =altura; //el primer arbol será por ahora el mas alto
		etiquetaArbolMasAlto = 0; //el arbol con la etiqueta 0, es el mas alto.
		while (altura !=-1) {
			if (altura > alturaArbolMasAlto) { //hemos encontrado un arbol mas alto 
			 alturaArbolMasAlto =altura;
			 etiquetaArbolMasAlto = etiqueta;
			}
			etiqueta++; //incrementamos la etiqueta, para solicitar la altura del siguiente
			System.out.println("Altura del arbol ("+ etiqueta +"): ");
			altura = teclado.nextInt();
		}
		if (alturaArbolMasAlto == -1) {
			System.out.println("No hay ningun arbol");
		} else {
			System.out.println("El arbol mas alto mide: " +alturaArbolMasAlto);
			System.out.println("Etiqueta del arbol: " +etiquetaArbolMasAlto);
		}
	}

}

package actividadesPropuestas;

import java.util.Scanner;

public class EjemploPag61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una nota: ");
		int nota = teclado.nextInt();
		switch (nota) {
		case 0,1,2,3,4 : //bloque formado por dos instrucciones: entre llaves
			System.out.println("Suspenso.");
			System.out.println("Animo...");
		
		case 5 : // bloque de una unica instruccion: podemos obviar las llaves
			System.out.println("Suficiente.");
		case 6 :
			System.out.println("Bien.");
		case 7, 8 : 
			System.out.println("Notable.");
		case 9, 10 : 
			System.out.println("Sobresaliente.");
			System.out.println("Enhorabuena.");
	
		default :
			System.out.println("Nota incorrecta.");
		}
		
	} 

}

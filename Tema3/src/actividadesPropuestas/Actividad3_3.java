package actividadesPropuestas;

import java.util.Scanner;

public class Actividad3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implementar un programa que pida al usuario un numero positivo y lo muestre guarismo a guarismo
		//Por ejemplo, para el numero 123, debe mostrar primero el 3, a continuacion el 2 y por ultimo el 1.
		Scanner teclado = new Scanner(System.in);
		int num;
		String guarismo= " ";
			System.out.println("Introduce un numero positivo: ");
			num = teclado.nextInt();
		for(int i =num; i> 0; i= i/10) {
			int aux = i%10;
			guarismo = " "+aux +" " +guarismo;
				
			}System.out.println(guarismo);
	
			
	}

}

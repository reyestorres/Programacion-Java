package actividadesAplicacion;

import java.util.Scanner;

public class Actividad3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Numero decimal en binario
		//desconocemos cuantas cifras tiene el numero que introduce el usuario
		//mostrar el numero binario con un digito por linea
		int num;
		int binario=0;
		int contador=1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		 num = teclado.nextInt();
		while (num >0 ) {
			
			if (num ==1) {
				binario = binario + (num /2)*contador*10;
				binario = binario + (num %2)*contador;
			
			}else
				binario = binario + (num %2)*contador;
			contador=contador*10;
			num =  num /2;
		}
		 System.out.println("El resultado es: " +binario);
	}

}

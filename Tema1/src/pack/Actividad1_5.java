package pack;

import java.util.Scanner;

public class Actividad1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa que compruebe el rango de valores -32 768 y 32 767, con el tipo short
		//el valor siguiente es el máximo al minimo
		short num;
		num = 32767;
		System.out.println("El valor maximo es: "+num);
		num++;
		System.out.println("El valor minimo es:" +num );
		
		//mi version
		short num2;
		System.out.println("Introduce el numero 32767: ");
		Scanner teclado = new Scanner(System.in);
		num2 = teclado.nextShort();
		System.out.println("El valor maximo es: " +num2);
		num2++;
		System.out.println("El valor minimo es: " +num2);
		
		
		
		
	
		
		
	}

}

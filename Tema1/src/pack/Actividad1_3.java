package pack;

import java.util.Scanner;

public class Actividad1_3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir al usuario su edad y mostrar la que tendra el proximo anio
				int num;
				System.out.println("Dime tu edad: ");
				Scanner teclado = new Scanner(System.in);
				num = teclado.nextInt();
				System.out.println("Tu edad es: " +num);
				num++;
				System.out.println("El proximo anio tendras: " + num);
				
				
				
				
	}

}

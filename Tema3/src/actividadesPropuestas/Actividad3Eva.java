package actividadesPropuestas;

import java.util.Scanner;

public class Actividad3Eva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir un numero que sea mayor o igual a 3, dibujar un cuadrado con ese numero de filas y columnas
		Scanner teclado = new Scanner(System.in);
		int num;
		do {
			System.out.println("Introduce un numero mayor o igual que 3: ");
			num = teclado.nextInt();
		}while(num<3);

		for(int i=0; i<=num;i++) {
			for (int j=1;j<=num+2;j++) {
				System.out.print("* ");
				
			}
		
			System.out.println("");
		
			
			
		}
	}

}

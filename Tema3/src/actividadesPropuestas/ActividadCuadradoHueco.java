package actividadesPropuestas;

import java.util.Scanner;

public class ActividadCuadradoHueco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//para hacer hueco hay que hacer 4 for distintos, uno al principio luego dos anidados y uno al final
		Scanner teclado = new Scanner(System.in);
		int num;
		int i;
		do {
			System.out.println("Introduce un numero mayor o igual que 3: ");
			num = teclado.nextInt();
		}while(num<3);
		for(i=1; i<=num;i++) {
		
			for (int j=1;j<=num;j++) {
				if( j == 1 || j == num || i == 1 || i == num) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
				
			}
		
			System.out.println();
		
			
			
		}
	}

}

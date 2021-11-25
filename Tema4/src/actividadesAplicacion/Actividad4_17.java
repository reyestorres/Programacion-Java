package actividadesAplicacion;

import java.util.Scanner;

public class Actividad4_17 {
	static boolean sonAmigos(int a, int b) {
		int sumaDivisores1 = 0;
		int sumaDivisores2 = 0;
		if(a== sumaDivisores1 && b==sumaDivisores2) {
			return true;
		}else {
			return false;
		}
			
		
		
	}
	
	int sumaDivisores(int numero) {
		int suma=0;
		for(int i =0;i<numero;i++) {
			if(numero % i==0) {
				suma+=i;
			}
		}return suma;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce a: ");
		int a = teclado.nextInt();
		System.out.println("Introduce b: ");
		int b = teclado.nextInt();
		boolean sonAmigos;
		sonAmigos =sonAmigos(a, b);
		if (sonAmigos) {
			System.out.println("Los numeros son amigos");
		}else {
			System.out.println("Los numeros no son amigos");
		}
	}

}

//> <
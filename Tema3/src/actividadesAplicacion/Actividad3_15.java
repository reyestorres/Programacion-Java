 package actividadesAplicacion;

import java.util.Scanner;

public class Actividad3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dise�a una aplicacion que dibuje un triangulo de pascal, para n fila.
		//numerando las filas y elementos desde 0. 
		//E(n,m) = n!/m!(n-m)!
		//3!=3*2*1=6
		//3 for para cada uno de los factoriales(3)
		
		Scanner teclado = new Scanner(System.in);
		int l;
		int n,m;
		int i,j;
		int a,b,c;
		int subRes1 = 1;
		int subRes2 = 1;
		int subRes3 = 1;
		System.out.println("Introduce un numero: ");
		l= teclado.nextInt();
		for(i=1;i<=l;i++) {
			for ( j = 1; j <= i; j++) {
				n = i - 1;
				m = j - 1;
				for(a = n; a>0; a--) {
					subRes1 = subRes1 * a;
				}
				for(b = m; b>0; b--) {
					subRes2 = subRes2 * b;
				}
				for(c = n-m; c>0; c--) {
					subRes3 = subRes3 * c;
				}
				int resFinal=subRes1/(subRes2*subRes3);
				System.out.print(resFinal + " ");
				subRes1 = 1;
				subRes2 = 1;
				subRes3 = 1;
		}
			System.out.println("");
		}
		
	}

}

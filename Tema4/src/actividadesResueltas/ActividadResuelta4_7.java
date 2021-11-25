package actividadesResueltas;

public class ActividadResuelta4_7 {
	static boolean esPrimo(int num) {
		boolean primo = true;
		int i = 2;
		if(num<2) {
			primo = false;
		}
		while(i<num && primo ==true) {
			if(num % i==0) {
				primo=false;
			}
			i++;
		}
		return primo;
	}
	static int numDivisoresPrimos(int num) {
		int cont=0;
		for(int i=2;i<=num;i++) {
			if(esPrimo(i) && num % i==0) {
				cont++;
			}
		}
		return cont;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Divisores de 24: " +numDivisoresPrimos(24));
	}

}

//> <
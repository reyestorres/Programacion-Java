package actividadesResueltas;

public class EjemploPag87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for(i=1; i<=3; i++) {
			System.out.println("Bucle externo, i="+i);
			j=1;
			while (j<=1) {
				System.out.println("...Bucle interno, j="+j);
				j++;
			}
		}
	}

}

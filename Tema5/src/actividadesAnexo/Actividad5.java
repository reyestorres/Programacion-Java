package actividadesAnexo;

public class Actividad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Buscar una secuencia numérica dentro de un vector de enteros*/
		int vector[] = {1,8,1,8,1,8,14,14,14,14,27,27};
		int cont = 0;
		for(int i=0;i<vector.length-1;i++) {
			if(vector[i]==14 && vector[i+1]==14) {
				cont++;
			}
		}
		System.out.println("La secuencia aparece "+cont+ " veces");;
	}

}

//> <
package actividadesResueltas;

public class Actividad3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Diseñar una aplicacion que muestre las tablas de multiplicar del 1 al 10
		int tabla;
		int i;
		for(tabla =1; tabla<=10;tabla++) {
			System.out.println(" Tabla del: "+tabla);
			for(i =0; i<=10;i++) {
				
				System.out.println(tabla+"x"+i+"="+tabla*i);
			}
		}
	}

}

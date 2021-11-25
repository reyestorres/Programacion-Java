package actividadesPropuestas;

public class actividadPropuesta5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla1[], tabla2[], tabla3[], tabla4[], tabla5[];
		tabla1=new int[10];
		tabla2=new int[10];
		tabla3=new int[10];
		tabla4=new int[10];
		tabla5=new int[10];
		tabla1=tabla2;
		tabla3=tabla4;
		tabla5=tabla1;
		tabla4=tabla5;
		tabla2=tabla3;
		System.out.println(tabla1);
		System.out.println(tabla2);
		System.out.println(tabla3);
		System.out.println(tabla4);
		System.out.println(tabla5);
		int[]edad= {7,17,21,33};
		int nElementos = 1;
		for(int i=0;i<nElementos;i++) {
			System.out.println("El elemento:"+i+ " es:"+edad[i]);
		}
		
	}

}

//> <
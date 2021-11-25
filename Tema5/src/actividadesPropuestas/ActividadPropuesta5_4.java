package actividadesPropuestas;

public class ActividadPropuesta5_4 {
	//busca de forma secuencial en la tabla t el valor clave.
	// En caso contrario, devuelve en que posicion lo encuentra y en caso contrario devuelve -1
	static int buscar(int t[], int clave) {
		int i=0;
		while(i<t.length && t[i] !=clave) {
			i++;
		}
		if(i<t.length) {
			System.out.println("Se encuentra en " +i+ " posicion");
		}else {
			System.out.println(-1); //debo devolver -1
		}
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t[] = {2, 8, 4 , 9 , 10, 100};
		int clave=8;
		buscar(t,clave);
		
	}

}

//> <
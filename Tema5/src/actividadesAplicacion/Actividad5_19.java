package actividadesAplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int participantes[]=new int[0];
		int ranking[]=new int[0];
		int dorsal = 0;
		int numParticipantes = 0;
		int dorsalTest[]=new int[0];
		int dorsalMenoresEdad[]=new int[0];
		int dorsalNoPagado[]=new int[0];;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Un participante llego a la meta: ");
			
			dorsal =teclado.nextInt();
			if(dorsal > -1) {
				participantes = Arrays.copyOf(participantes, participantes.length + 1);
				participantes[numParticipantes] = dorsal;
			} 
			numParticipantes++;
		}while(dorsal !=-1);
		System.out.println(Arrays.toString(participantes));
		
		//Buscar menores de edad
		int numParticipantesMenoresDeEdad = 0;
		do{
			System.out.println("Introduce todos los dorsales de los corredores menores de edad: ");
			
			dorsal =teclado.nextInt();
			avanza1Puesto(ranking, dorsal);
			System.out.println(Arrays.toString(ranking));
			if(dorsal > -1) {
				dorsalMenoresEdad = Arrays.copyOf(dorsalMenoresEdad, dorsalMenoresEdad.length + 1);
				dorsalMenoresEdad[numParticipantesMenoresDeEdad] = dorsal;
			} 
			numParticipantesMenoresDeEdad++;
		}while(dorsal !=-1);
		
		for (int i = 0; i<dorsalMenoresEdad.length; i++) {
			int menor = dorsalMenoresEdad[i];
			int indiceEnCorredores = buscar(participantes, menor);
			
			if(indiceEnCorredores > 0) {
				int aux = participantes[indiceEnCorredores - 1];
				participantes[indiceEnCorredores - 1] = menor;
				participantes[indiceEnCorredores] = aux;
			}
		}
		System.out.println(Arrays.toString(participantes));
		
		
		//Los dopao
		int numParticipantesDopados = 0;
		do{
			System.out.println("Introduce los dorsales de los corredores positivo test antidopaje: ");
			
			dorsal =teclado.nextInt();
			if(dorsal > -1) {
				dorsalTest = Arrays.copyOf(dorsalTest, dorsalTest.length + 1);
				dorsalTest[numParticipantesDopados] = dorsal;
			} 
			numParticipantesDopados++;
		}while(dorsal !=-1);
		
		for (int i = 0; i<dorsalTest.length; i++) {
			int dopado = dorsalTest[i];
			
			participantes = borrado(participantes, dopado);
			numParticipantes--;
		}
		System.out.println(Arrays.toString(participantes));
		
		//Los morosos
		//Buscar menores de edad
		int numParticipantesMorosos = 0;
		do{
			System.out.println("Introduce los dorsales de los que no han pagado la inscripci�n: ");
			
			dorsal =teclado.nextInt();
			if(dorsal > -1) {
				dorsalNoPagado = Arrays.copyOf(dorsalNoPagado, dorsalNoPagado.length + 1);
				dorsalNoPagado[numParticipantesMorosos] = dorsal;
			} 
			numParticipantesMorosos++;
		}while(dorsal !=-1);
		
		int j = participantes.length - 1;
		for (int i : dorsalNoPagado) {
			int moroso = i;
			int indiceEnCorredores = buscar(participantes, moroso);
			
			if(indiceEnCorredores < j) {
				int aux = participantes[j];
				participantes[j] = moroso;
				participantes[indiceEnCorredores] = aux;
				j = j - 1;
			}
			
		}
		System.out.println(Arrays.toString(participantes));
		
		
		System.out.println("----Medallero----");
		if (ranking.length >=1) {
			System.out.println("Oro: "+ranking[0]);
		}
		if(ranking.length>=2) {
			System.out.println("Plata: "+ranking[1]);
		}
		if(ranking.length>=2) {
			System.out.println("Bronce: "+ranking[2]);
		}
		
	}
	
	
	private static void avanza1Puesto(int[] ranking, int dorsal) {
		// TODO Auto-generated method stub
		
	}


	static int[] borrado(int [] t, int aBorrar) {
		int indiceBorrado = buscar(t,  aBorrar);
		int[] vectorDestino = new int[t.length - 1];
        int elementosRestantes = t.length - ( indiceBorrado + 1 );
        System.arraycopy(t, 0, vectorDestino, 0, indiceBorrado);
        System.arraycopy(t, indiceBorrado + 1, vectorDestino, indiceBorrado, elementosRestantes);
        return vectorDestino;
	}
	
	static int buscar(int t[], int aBorrar) {
		int out = -1;
		for(int i = 0; i<t.length; i++) {
			if(t[i] == aBorrar) {
				out = i;
				return out;
			}
		}
		return out;
	}
}

//> <
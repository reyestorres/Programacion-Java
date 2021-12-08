package tresEnRaya;

import java.util.Arrays;
import java.util.Scanner;

public class TresEnRaya {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ficha jugador=1 y ficha ordenador=2
		Scanner teclado=new Scanner(System.in);
		int matrizJuego[][]=new int[3][3];
		int fichaUsuario;
		int fichaOrdenador;
		int ficha=0;
		boolean matrizLlena=false;
		boolean existeGanador=false;
		System.out.println("JUEGO TRES EN RAYA");
		mostrarTablero(matrizJuego);
		do {
			ponerFichaUsuario(matrizJuego);
			ponerFichaOrdenador(matrizJuego);
		}while(!existeGanador && !matrizLlena);
		System.out.println(matrizJuego);
		System.out.println(comprobarFicha(matrizJuego,ficha));
		mostrarTablero(matrizJuego);
		
		
	}
	
	static boolean comprobarFicha(int matrizJuego[][], int ficha) {
		if() {
			
		}else {
			
		}
		
		return false;
		
	}
	static void ponerFichaOrdenador(int matrizJuego[][]) {
		int fichaOrdenadorFila;
		int fichaOrdenadorColumna;
		boolean ocupado;
		do {
			System.out.println("El ordenador introduce una ficha: ");
			fichaOrdenadorFila=(int) (Math.random()*3);
			fichaOrdenadorColumna=(int) (Math.random()*3);
			ocupado=posicionOcupada(matrizJuego, fichaOrdenadorFila, fichaOrdenadorColumna);
		}while(!ocupado);
		matrizJuego[fichaOrdenadorFila][fichaOrdenadorColumna]=2;
	}
	
	
	static void ponerFichaUsuario(int matrizJuego[][]) {
		Scanner teclado=new Scanner(System.in);
		int fichaUsuarioFila;
		int fichaUsuarioColumna;
		boolean ocupado;
		do {
			System.out.println("Introduce una ficha para la fila: ");
			fichaUsuarioFila= teclado.nextInt();
			System.out.println("Introduce una ficha para la columna: ");
			fichaUsuarioColumna= teclado.nextInt();
			ocupado=posicionOcupada(matrizJuego, fichaUsuarioFila, fichaUsuarioColumna);
		}while(!ocupado);
		matrizJuego[fichaUsuarioFila][fichaUsuarioColumna]=1;
		
	}
	
	private static boolean posicionOcupada(int[][] matrizJuego, int fichaFila, int fichaColumna) {
		// TODO Auto-generated method stub
		if(matrizJuego[fichaFila][fichaColumna] !=0) {
			return false;
		}else {
			return true;
		}
		
	}

	private static void mostrarTablero(int[][] matrizJuego) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			System.out.print("[");
			for(int j=0;j<3;j++) {
				System.out.print("]");
			}
		}
		
	}

}

//> <
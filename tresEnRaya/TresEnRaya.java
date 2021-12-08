package tresEnRaya;

import java.util.Arrays;
import java.util.Scanner;

public class TresEnRaya {
	public static void main(String[] args) {
		//Ficha jugador=1 y ficha ordenador=2
		Scanner teclado=new Scanner(System.in);
		int matrizJuego[][]=new int[3][3];
		boolean matrizLlena=false;
		boolean existeGanador=false;
		System.out.println("JUEGO TRES EN RAYA");
		mostrarTablero(matrizJuego);
		do {
			ponerFichaUsuario(matrizJuego);
			ponerFichaOrdenador(matrizJuego);
			mostrarTablero(matrizJuego);
			existeGanador = comprobarGanador(matrizJuego);
			matrizLlena = estaMatrizLlena(matrizJuego);
		}while(!existeGanador && !matrizLlena);
		mostrarTablero(matrizJuego);
	}
	
	static void ponerFichaOrdenador(int matrizJuego[][]) {
		int fichaOrdenadorFila;
		int fichaOrdenadorColumna;
		boolean ocupado;
		System.out.println("El ordenador introduce una ficha: ");
		do {
			fichaOrdenadorFila=(int) (Math.random()*3);
			fichaOrdenadorColumna=(int) (Math.random()*3);
			ocupado=posicionOcupada(matrizJuego, fichaOrdenadorFila, fichaOrdenadorColumna);
		}while(!ocupado && !estaMatrizLlena(matrizJuego));
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

	private static boolean comprobarGanador(int[][] matrizJuego){
		int primarJugadorFila;
		//Comprobar por filas
		for (int i = 0; i < 3; i++) {
			primarJugadorFila = matrizJuego[i][0];
			for (int j = 0; j < 3; j++) {
				if(matrizJuego[i][j] != primarJugadorFila  || matrizJuego[i][j] == 0) break;
				if(matrizJuego[i][j] == primarJugadorFila && j == 2){
					System.out.println("El judador "+primarJugadorFila+" ha ganado.");
					return true;
				}
			}
		}
		int primarJugadorColumna;
		//Comprobar por columnas
		for (int j = 0; j < 3; j++) {
			primarJugadorColumna = matrizJuego[0][j];
			for (int i = 0; i < 3; i++) {
				if(matrizJuego[i][j] != primarJugadorColumna || matrizJuego[i][j] == 0) break;
				if(matrizJuego[i][j] == primarJugadorColumna && i == 2) {
					System.out.println("El judador "+primarJugadorColumna+" ha ganado.");
					return true;
				}
			}
		}

		int primarJugadorDiagonalPrincipal = matrizJuego[0][0];
		//Comprobar por diagonal principal
		for (int i = 0; i < 3; i++) {
			if(matrizJuego[i][i] != primarJugadorDiagonalPrincipal  || matrizJuego[i][i] == 0) break;
			if(matrizJuego[i][i] == primarJugadorDiagonalPrincipal && i == 2) {
				System.out.println("El judador "+primarJugadorDiagonalPrincipal+" ha ganado.");
				return true;
			}
		}

		int primarJugadorDiagonalSecundaria = matrizJuego[0][2];
		//Comprobar por diagonal secundaria
		int i = 0;
		int j = 2;

		while (i < 3) {
			if(matrizJuego[i][j] != primarJugadorDiagonalSecundaria || matrizJuego[i][j] == 0) break;
			if(matrizJuego[i][j] == primarJugadorDiagonalSecundaria && i == 2) {
				System.out.println("El judador "+primarJugadorDiagonalSecundaria+" ha ganado.");
				return true;
			}
			i++;
			j--;
		}

		return false;
	}

	private static boolean estaMatrizLlena(int[][] matrizJuego){
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++) {
				if(matrizJuego[i][j] == 0) return false;
			}
		}return true;
	}
	
	private static boolean posicionOcupada(int[][] matrizJuego, int fichaFila, int fichaColumna) {
		if(matrizJuego[fichaFila][fichaColumna] !=0) {
			return false;
		}else {
			return true;
		}
		
	}

	private static void mostrarTablero(int[][] matrizJuego) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("|"+matrizJuego[i][j]+"|");
			}System.out.println();
		}
	}

}

//> <
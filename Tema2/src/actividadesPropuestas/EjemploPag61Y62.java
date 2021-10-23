package actividadesPropuestas;

import java.util.Scanner;

public class EjemploPag61Y62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba un mes (1 al 12): ");
		int mes = new Scanner(System.in).nextInt();
		int dias = switch(mes) {
		case 1, 3, 5, 7, 8, 10, 12 : {
			yield 31; //estos meses tienen 31 dias
		}
		case 2 : {
			yield 28; //febrero tiene 28 dias
		}
		case 4, 6, 9, 11 : {
			yield 30; //el resto de los meses tienen 30 dias
		}
			default : {
				yield -1; //con -1 indicamos que hay un error
			}
		};
		System.out.println("Dias: ");
	}

}

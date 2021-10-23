package actividadesResueltas;

import java.util.Scanner;

public class Actividad2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el primer numero: ");
		a = teclado.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		b = teclado.nextInt();
		System.out.println("Introduzca el tercer numero: ");
		c = teclado.nextInt();
		if (a > b && c > b) {
			System.out.println(a +", "+b+", " +c);
		} else if (a > c && c >b) {
			System.out.println(a +", "+c+", " +b);
		} else if (b > a && a >c) {
			System.out.println(b +", "+a+", " +c);
		} else if (b > c && c >a) {
			System.out.println(b +", "+c+", " +a);
		} else if (c > a && a >b) {
			System.out.println(c +", "+a+", " +b);
		} else if (c > b && b >a) {
			System.out.println(c +", "+b+", " +a);
		}
	}

}

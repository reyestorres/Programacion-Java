package pack;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dado el siguiente polinomio de segundo grado y = ax2 + bx + c
		//crea un programa que pida los coeficientes a.b y c, así como el valor de x,
		//y calcula el valor correspondiente de y
		//math.pow para la potencia y math.sqrt para la raiz
		int a, b, c;
		int x;
		double y;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer coeficiente(a): ");
		a = teclado.nextInt();
		System.out.println("Introduce el segundo coeficiente(b): ");
		b = teclado.nextInt();
		System.out.println("Introduce el tercer coeficiente(c): ");
		c = teclado.nextInt();
		System.out.println("Introduce el valor de x: ");
		x = teclado.nextInt();
		y = a * Math.pow(x, 2) + b*x + c;
		System.out.println("Resultado de la y: " +y);
		
		
		
		
		
		
	}

}

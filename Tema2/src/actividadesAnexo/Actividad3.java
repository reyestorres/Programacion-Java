package actividadesAnexo;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Introduce el primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer numero: ");
		num3 = teclado.nextInt();
		if (num1 > num2 && num1 > num3 ) {
			System.out.println(num1+" Es mayor que: " +num2+ " y " +num3);
		} else if (num2 > num3 && num2 > num1) {
				System.out.println(num2+" Es mayor que: " +num1+ " y " +num3);
		}
		else if (num3 > num1 && num3 > num2) {
					System.out.println(num3+" Es mayor que: " +num1+ " y " +num2);
				} else  {
			System.out.println("Error: ninguno es mayor que otro.");
		}
	}

}

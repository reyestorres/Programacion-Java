package pack;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Un economista te ha encargado un programa para realizar cálculos con el IVA.
		//La aplicación debe solicitar la base imponible y el IVA que se debe aplicar. 
		//Muestra en pantalla el importe correspondiente al IVA y al total.
		double baseImponible;
		double iva;
		double total;
		double precio;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba la base imponible que deseas meter: ");
		baseImponible = teclado.nextDouble();
		System.out.println("Escriba el IVA a aplicar: ");
		iva= teclado.nextDouble();
		precio = baseImponible * iva/100;
		total = precio + iva;
		//sumar el iva
		System.out.println("El importe al IVA es: " + iva + " y al total " +total);
		
		
		
		
		
		
		
	}

}

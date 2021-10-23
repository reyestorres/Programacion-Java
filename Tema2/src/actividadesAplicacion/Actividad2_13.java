package actividadesAplicacion;

import java.util.Scanner;

public class Actividad2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double comidaDiaria;
		int numAnimales;
		double kilosPorAnimal;
		double racionDiaria;
		double comidaTotal;
		System.out.println("Introduce una cantidad de comida diaria que se compra: ");
		comidaDiaria = teclado.nextDouble();
		System.out.println("Introduce el numero de animales a alimentar: ");
		numAnimales = teclado.nextInt();
		System.out.println("Introduce los kilos que comen: ");
		kilosPorAnimal = teclado.nextDouble();
		comidaTotal = kilosPorAnimal * numAnimales;
		if(comidaDiaria >= comidaTotal) {
			System.out.println("Si disponemos de alimento suficiente");
		} else {
			racionDiaria = comidaDiaria/numAnimales;
			System.out.println("No disponemos de alimento suficiente");
			System.out.println("Esta es la racion diaria de cada animal: " +racionDiaria);
		}
		
	}

}

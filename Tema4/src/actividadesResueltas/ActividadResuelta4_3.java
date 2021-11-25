package actividadesResueltas;

import java.util.Scanner;

public class ActividadResuelta4_3 {

		static void areaVolumenCilindro(double radio, double altura, int opcion) {
			double volumen, area;
			switch (opcion) {
			case 1 -> {
				volumen = Math.PI * Math.pow(radio, 2) * altura;
				System.out.println("El volumen es de: " +volumen);
			}
			case 2 -> {
				area = 2 * Math.PI * radio * (altura+radio);
				System.out.print("El area es de: " +area);
			}
			default -> System.out.print("Indicador del calculo erroneo.");
			}
		}
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el radio: ");
		double radio = teclado.nextDouble();
		System.out.print("Introduzca la altura: ");
		double altura = teclado.nextDouble();
		System.out.print("Que desea calcular(1 (volumen) / 2(area): ");
		int tipoCalculo = teclado.nextInt();
		System.out.println();
		areaVolumenCilindro(radio, altura, tipoCalculo);

		
	}
}


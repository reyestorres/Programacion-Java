package actividadesPropuestas;

import java.util.Scanner;

public class Actividad3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//diseña una aplicacion que muestre la edad maxima y minima de un grupo de alumnos. 
		//El usuario introducira las edades y terminara escribiendo un -1
		Scanner teclado = new Scanner(System.in);
		int maxima;
		int minima;
		int edad;
		/*si quiero inicializar las variables tengo que poner el mayor numero al minimo y el maximo el 0 por ejemplo:
		minimo = 1232343455 y maximo =0. 
		Tambien esta la opcion de poner minima = edad y maxima = edad*/
		System.out.println("Introduce las edades de los alumnos: ");
		edad = teclado.nextInt();
		minima = edad;
		maxima = edad;
		while (edad != -1) {
				if(edad < minima) {
					minima = edad;
				}else {
					if(edad > maxima) {
						maxima = edad;
					}
				}
				System.out.println("Introduce las edades de los alumnos: ");
				edad = teclado.nextInt();
				
		}
		System.out.println("La edad maxima es: " + maxima);
		System.out.println("La edad minima es: " +minima);
	}

}

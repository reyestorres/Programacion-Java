package actividadesResueltas;

import java.util.Scanner;

public class Actividad3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implementar una aplicacion para calcular datos estadisticos de las edades de los alumnos de un
		//centro educativo. Se introduciran datos hasta que uno de ellos sea negativo, y se mostrara:
		///la suma de todas las edades introducidas, la media, el numero de alumnos y cuantos son mayores de edad
		Scanner teclado = new Scanner(System.in);
		int sumaEdades = 0; //acumulara la suma de todas las edades
		int contadorAlumnos = 0; //contador de alumnos (o de edades introducidadas)
		int contadorMayorEdad = 0; //contador del numero de alumnos mayores de edad
		double media;
		System.out.println("Introduzca edad: ");
		int edad = teclado.nextInt(); //leemos la edad
		while (edad >= 0) { //repetimos mientras la edad no sea negativa
			sumaEdades += edad; //acumulamos la edad introducida
			contadorAlumnos++; //incrementamos, se ha introducido la edad de un alumno mas
			if (edad >=18) { //si la edad introducida corresponde a un mayor de edad
				contadorMayorEdad++; //incrementamos, ahora hay un mayor de edad mas
			}
			System.out.println("Introduzca edad: ");
			edad = teclado.nextInt(); //volvemos a leer
			
		}
		media = (double) sumaEdades/contadorAlumnos; //con el cast la division es real mostramos el informe estadistico
		System.out.println("Suma de todas las edades: " +sumaEdades);
		System.out.println("Media: " +media);
		System.out.println("Numero total de alumnos: " +contadorAlumnos);
		System.out.println("Mayores de edad: " +contadorMayorEdad);
	} 

}

package pack;

import java.util.Scanner;

public class Actividad1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lluvia, tareas y biblioteca vamos a tener 3 booleanos
		//¿cuando puedo salir a la calle? puedo salir si no hay lluvia, si las tareas están hechas y si tenemos que ir a la biblioteca
		//lluvia == false, tareas==true, biblioteca==true
		boolean lluvia;
		boolean tarea;
		boolean biblioteca;
		boolean salir;
		System.out.println("¿Va a llover?: ");
		Scanner teclado= new Scanner(System.in);
		lluvia = teclado.nextBoolean();
		System.out.println("¿Has terminado las tareas?: ");
		tarea = teclado.nextBoolean();
		System.out.println("¿Vas a la biblioteca?: ");
		biblioteca = teclado.nextBoolean();
		salir = (!lluvia  && tarea) || biblioteca;
		System.out.println("Puedes salir " +salir) ;
		
	}

}

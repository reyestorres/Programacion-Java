package pack;

import java.util.Scanner;
import java.util.*;
public class Actividad12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realizar un programa para una competicion donde la longitud del lanzamiento se mide en metros(con tantos decimales como desees)
		// pero para el ranking solo se tiene en cuenta la longitud en centimetros (sin decimales)
		//Pedir la longitud en metros de un lanzamiento y mostrar la parte entera correspondiente en centimetros
		double longitudM;
		int longitudCm;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una longitud en metros: ");
		longitudM = teclado.nextDouble();
		longitudCm = (int) (longitudM * 100);
		System.out.println("El resultado del lanzamiento es: " + longitudCm +"cm");
		
	}

}

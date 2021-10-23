package actividadesAplicacion;

import java.util.Scanner;

public class Actividad2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Grados del angulo: ");
		int grados = new Scanner(System.in).nextInt();
		grados %=360;
		double radianes = grados*Math.PI/180;
		System.out.println("Los radianes son: " +radianes);
	}

}

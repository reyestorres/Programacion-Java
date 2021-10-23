package actividadesAnexo;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int dia;
		int mes;
		System.out.println("Introduce el dia de tu fecha de nacimiento: ");
		dia = teclado.nextInt();
		System.out.println("Introduce el mes de tu fecha de nacimiento: ");
		mes = teclado.nextInt();
		switch(mes) {
		case 1 :
			System.out.println("Enero");
			if (dia>=20)
			      System.out.println("Acuario");
			else System.out.println("Capricornio");
			break;
		case 2 :
			System.out.println("Febrero");
			if (dia >=19)
			System.out.println("Piscis");
			else  System.out.println("Acuario");
			break;
		case 3 :
			System.out.println("Marzo");
			if (dia >=21)
				System.out.println("Aries");
			else System.out.println("Piscis");	
			break;
		case 4 :
			System.out.println("Abril");
			if (dia >=20)
			System.out.println("Tauro");
			else System.out.println("Aries");
			break;
		case 5 :  
			System.out.println("Mayo");
			if (dia >=21)
			System.out.println("Géminis");
			else System.out.println("Tauro");
			break;
		case 6 : 
			System.out.println("Junio");
			if (dia >=21)
			System.out.println("Cáncer");
			else System.out.println("Géminis");
			break;
		case 7 :  
			System.out.println("Julio");
			if (dia >=23)
			System.out.println("Leo");
			else System.out.println("Cáncer");
			break;
		case 8 :  
			System.out.println("Agosto");
			if (dia >=23)
				System.out.println("Virgo");
			else System.out.println("Leo");
			break;
		case 9 : 
			System.out.println("Septiembre");
			if (dia>=23)
			System.out.println("Libra");
			else System.out.println("Virgo");
			break;
		case 10 : 
			System.out.println("Octubre");
			if (dia>=23)
			System.out.println("Escorpio");
			else System.out.println("Libra");
			break;
		case 11 :  
			System.out.println("Noviembre");
			if (dia >=22)	
			System.out.println("Sagitario");
			else System.out.println("Escorpio");
			
			break;
		case 12 :  
			System.out.println("Diciembre");
			if (dia >=22)
			System.out.println("Capricornio");	
			else System.out.println("Sagitario");;
			break;
			
		
		}
	}

}

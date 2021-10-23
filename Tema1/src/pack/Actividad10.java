package pack;

public class Actividad10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in).useLocale(java.util.Locale.US);
		System.out.println("Escribe un numero: ");
		double numero = sc.nextDouble();
		double raizCuadrada = java.lang.Math.sqrt(numero);
		System.out.println("La raiz cuadrada es: " +raizCuadrada);

	}

}

package actividadesResueltas;

public class ActividadResuelta4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Realiza una operacion: ");
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multipliacion ");
		System.out.println("4.Division ");
		for(int operacion=1; operacion<=4; operacion++) {
			double resultado =calculadora(3.0, 4.0, operacion);
			System.out.println(resultado);
		}
		
	}
	static double calculadora(double a, double b, int operacion) {
		double result;
		result=switch(operacion) {
		case 1-> //suma
		a+b;

		case 2-> //resta
		a-b;
		
		case 3-> //multiplicacion
		a*b;
		
		case 4-> //division
		(double)a/b;
		default-> {
			System.out.println("Operacion no valida");
			yield 0;
			}	
		};
		return(result);
	}

}

//> <
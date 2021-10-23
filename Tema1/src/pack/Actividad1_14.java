package pack;
import java.util.Locale; //importamos las dos clases que necesitamos
import java.util.Scanner;
//cuando se importan multiples clases de un mismo paquete, en lugar de escribir un import de cada clase
//existe la opcion de usar: 
import java.util.*; //importa las clases necesarias de java.util
/* redondear un numero decimal significa aproximarlo al entero mas cercano.
 * para ello, lo que haremos será sumar 0.5 y truncar (eliminar los decimales)
 * el resultado. asi los numeros:
 * 2.3 se redondea a 2
 * 4.8 se redondea a 5 
 */
public class Actividad1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n; //aqui guardamos el numero decimal introducido por el usuario
		int redondeo; //utilizamos esta variable para truncar los decimales
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US); //en lugar de coma utiliza punto para los decimales
		System.out.println("Escriba un numero decimal(con punto): ");
		n = teclado.nextDouble();
		//ahora redondearemos n
		redondeo = (int) (n + 0.5); //convertimos un real en un entero
		//Esta es una conversion por estrechamiento, por lo tanto estamos obligados a aplicar un cast (int).
		//En caso de no hacerlo el compilador generara un error
		System.out.println(n + " redondeado es: " + redondeo);

	}

}

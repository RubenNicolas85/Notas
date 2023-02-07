package notas;

/** Paquete notas: Paquete que hemos creado al iniciar nuestro proyecto de Java y que es donde
 * se guardan los ficheros .java que contienen el código fuente de nuestro programa*/

import java.util.Scanner;

/** Sentencia import: Se usa para importar otros paquetes o librerías (clases) que no pertenecen 
 * al paquete por defecto (java.lang) o que están fuera del paquete donde estamos trabajando */

/** Clase principal Calificaciones: Es la clase principal del programa, puesto que es la que
 * contiene el método main, el cual lleva a cabo la ejecución del programa */

public class Calificaciones {
	
	/** Método main: Es el método ubicado en la clase principal de nuestro programa y el que lleva 
	 * a cabo la ejecución del mismo. Las sentencias o métodos incluidos en el main se van ejecutando
	 * de arriba hacia abajo, con la excepción de bucles o de otras estructuras de control de flujo
	 * que pudiera haber. En nuestro caso, se crea un objeto de tipo Scanner cuya referencia es 
	 * "reader" para pedir datos por teclado al usuario, se declaran las variables "n" (entero) y 
	 * "c" (String) y a continuación se muestra en pantalla un mensaje para que el usuario a continuación 
	 * introduzca un valor entero. A continuación, el valor entero almacenado en "n" se pasa al método 
	 * califica de la clase califica y el resultado devuelto se almacena en "c". Por último, se muestra 
	 * por consola el valor de "c" y la ejecución finaliza cerrando el objeto de Scanner "reader" */
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int n = 0;
		String c = "";
		System.out.print("Introduzca el valor de una calificación: ");
		n = reader.nextInt();
		c = notas.califica.califica(n);
		System.out.println(c);
		reader.close();
	}

	/** Método "cali" declarado en desuso puesto que ha sido suplantado por otro método tras los cambios 
	 * que hemos realizado en nuestro programa. Devuelve un string siguiendo la ruta en la que está el nuevo
	 * método: notas.califica.califica(nota); */
	
	/**
	 * @param nota
	 * @return
	 * @deprecated Use {@link notas.califica#califica(int)} instead
	 */
	public static String cali(int nota) {
		return notas.califica.califica(nota);
	}
}
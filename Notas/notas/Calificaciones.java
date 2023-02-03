package notas;

import java.util.Scanner;

public class Calificaciones {
	
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

	/**
	 * @param nota
	 * @return
	 * @deprecated Use {@link notas.califica#califica(int)} instead
	 */
	public static String cali(int nota) {
		return notas.califica.califica(nota);
	}
}
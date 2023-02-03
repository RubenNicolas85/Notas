package notas;

import java.util.Scanner;

public class Calificaciones {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int n = 0;
		String c = "";
		System.out.print("Introduzca el valor de una calificación: ");
		n = reader.nextInt();
		c = cali(n);
		System.out.println(c);
		reader.close();
	}

	/**
	 * @param nota
	 * @return
	 */
	public static String cali(int nota) {
		String c;
		if (nota >= 0 && nota < 5)
			c = "Suspenso";
		else if (nota >= 5 && nota < 7)
			c = "Aprobado";
		else if (nota >= 7 && nota < 9)
			c = "Notable";
		else if (nota >= 9 && nota <= 10)
			c = "Sobresaliente";
		else
			c = "El valor de la calificación introducida no es correcta";
		return c;
	}
}
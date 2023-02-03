package notas;

public class califica {

	/**
	 * @param num_nota
	 * @return
	 */
	public static String califica(int num_nota) {
		String c;
		if (num_nota >= 0 && num_nota < 5)
			c = "Suspenso";
		else if (num_nota >= 5 && num_nota < 7)
			c = "Aprobado";
		else if (num_nota >= 7 && num_nota < 9)
			c = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
			c = "Sobresaliente";
		else
			c = "El valor de la calificación introducida no es correcta";
		return c;
	}

}

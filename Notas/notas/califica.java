package notas;

/** Paquete notas: Paquete que hemos creado al iniciar nuestro proyecto de Java y que es donde
 * se guardan los ficheros .java que contienen el código fuente de nuestro programa*/

public class califica {

/** Clase califica: Clase que hemos creado específicamente para trasladar el método califica desde la
 * clase principal */
	
	/**
	 * @param num_nota
	 * @return
	 */
	
	/** Método califica, creado en la clase principal suplantando al anterior método llamado cali y 
	 * trasladado posteriormente a esta clase. Este método recibe un parámetro de tipo entero y en 
	 * función del valor puede devolver hasta 5 resultados diferentes de tipo String, dependiendo del rango al cual 
	 * pertenezca el parámetro introducido */
	
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

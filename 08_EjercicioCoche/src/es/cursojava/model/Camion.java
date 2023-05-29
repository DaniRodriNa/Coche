package es.cursojava.model;
/**
 * Clase hija Camion que contendra las propiedades de un camion Hereda la clase
 * Vehiculo
 * 
 * @version 1.0 11-05-23
 * @author Daniel Rodriguez
 *
 */
public class Camion extends Vehiculo{
	/**
	 * @param NUMRUEDAS -> constante de tipo entero que tendra el valor de 8
	 */
	private static final int NUMRUEDAS=8;

	public Camion(String matricula, int numRuedas, String marca, String color, int numPuertas, int centCubicos,
			int caballos, int velocidadMax, int marchas) {
		super(matricula, NUMRUEDAS, marca, color, numPuertas, centCubicos, caballos, velocidadMax, marchas);
	}
	@Override
	public void conducir() {
		System.out.println("El camion conduce");
	}

}

package es.cursojava.model;

/**
 * Clase padre Coche que contendra las propiedades de un coche Hereda la clase
 * Vehiculo
 * 
 * @version 1.0 11-05-23
 * @author Daniel Rodriguez
 *
 */
public class Coche extends Vehiculo {
	private static final int NUMRUEDAS = 4;

	/**
	 * 
	 * @param NUMRUEDAS constante porque el numero de ruedas del coche no cambia de
	 *                  4
	 */

	public Coche(String matricula, int numRuedas, String marca, String color, int numPuertas, int centCubicos,
			int caballos, int velocidadMax, int marchas) {
		super(matricula, NUMRUEDAS, marca, color, numPuertas, centCubicos, caballos, velocidadMax, marchas);
	}
	@Override
	public void conducir() {
		System.out.println("El coche conduce");
	}

	@Override
	public void avanzar(double metros) {
		super.avanzar(metros);
		System.out.println("El coche avanza "+metros+" ");
	}
	


}

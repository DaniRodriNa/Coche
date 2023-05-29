package es.cursojava.model;

public class Camion extends Vehiculo{
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

package es.cursojava.interfaz;

/**
 * Interfaz conducible Contendra los métodos de conducir,avanzar, retroceder y
 * parar
 * 
 * @version 1.0 11-05-23
 * @author Daniel Rodriguez
 *
 */
public interface Conducible {
	public void conducir();

	public void arrancar();

	public void avanzar(double metros);

	public void retroceder(double metros);

	public void parar();
}

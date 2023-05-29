package es.cursojava.model;

import java.util.Date;
import java.util.List;

import es.cursojava.interfaz.Conducible;

/**
 * Clase padre Vehiculo que contendra las propiedades generales Implementa la
 * interfaz de Conducible
 * 
 * @version 1.0 11-05-23
 * @author Daniel Rodriguez
 *
 */
public abstract class Vehiculo implements Conducible {
	protected final String matricula;
	private final int numRuedas;
	private String marca;
	private String color;
	private int numPuertas;
	private int centCubicos;
	private int caballos;
	private int velocidadMax;
	private int marchas;
	private double metros;
	private List<Double> tarcometro;
	//private int contador=0;

	/**
	 * 
	 * @param matricula    Matricula del vehiculo inmutable
	 * @param numRuedas    Ruedas del vehiculo inherente
	 * @param marca        Marca del vehiculo.
	 * @param color        Color del vehiculo.
	 * @param numPuertas   Numero de puertas que tiene el vehiculo.
	 * @param centCubicos  Centimetros cubicos del vehiculo.
	 * @param caballos     Potencia (caballos,cv) del vehiculo
	 * @param velocidadMax Velocidad maxima que alcanza el vehiculo en KM/H
	 * @param marchas      Numero de marchas que tiene el vehiculo.
	 * @param tarcometro   Array que almacenara las velocidades realizadas por el
	 *                     vehiculo
	 */

	public Vehiculo(String matricula, int numRuedas, String marca, String color, int numPuertas, int centCubicos,
			int caballos, int velocidadMax, int marchas) {
		this.matricula = matricula;
		this.numRuedas = numRuedas;
		this.marca = marca;
		this.color = color;
		this.numPuertas = numPuertas;
		this.centCubicos = centCubicos;
		this.caballos = caballos;
		this.velocidadMax = velocidadMax;
		this.marchas = marchas;
	}

	public String getColor() {
		return color;
	}

	/**
	 * 
	 * @param color el color que se le ha cambiado o puesto al vehiculo
	 */
	public void pintar(String color) {
		this.color = color;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public String getMatricula() {
		return matricula;
	}
	

	/*public List<Double> getTarcometro() {
		return tarcometro;
	}

	public void setTarcometro(List<Double> tarcometro) {
		this.tarcometro = tarcometro;
	}*/

	public double getMetros() {
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}
	@Override
	public void conducir() {
		
	}
	@Override
	public void arrancar() {
		System.out.println("El vehiculo ha arrancado");
	}

	@Override
	public void avanzar(double metros) {
		System.out.println("El vehiculo avanza "+metros+" metros");
	}

	@Override
	public void retroceder(double metros) {
		System.out.println("El vehiculo retrocede "+metros+" metros");
	}

	@Override
	public void parar() {
		System.out.println("El vehiculo ha parado");
	}

	/**
	 * 
	 * @param metros distancia que recorre el vehiculo
	 * @param tiempo cantidad de tiempo que le ha llevado a recorrer la distancia
	 * @return devuelve la velocidad metros/tiempo
	 */
	public double velocidad(double metros, double tiempo) {
		//contador++;
		//tarcometro[contador] = metros / tiempo;
		tarcometro.add(metros/tiempo);
		return metros / tiempo;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", numRuedas=" + numRuedas + ", marca=" + marca + ", color=" + color
				+ ", numPuertas=" + numPuertas + ", centCubicos=" + centCubicos + ", caballos=" + caballos
				+ ", velocidadMax=" + velocidadMax + ", marchas=" + marchas + "]";
	}

}

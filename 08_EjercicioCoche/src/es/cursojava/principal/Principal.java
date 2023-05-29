package es.cursojava.principal;

import es.cursojava.model.Camion;
import es.cursojava.model.Coche;
import es.cursojava.model.Vehiculo;

/**
 * Clase main que se ejecuta para comprobar el tipo de vehiculo y sus
 * propiedades
 * 
 * @author Daniel Rodriguez
 * @version 1.0 11-05-23
 *
 */
public class Principal {
	
	public static void main(String[] args) {
		Vehiculo coche = new Coche("1234SCS", 6, "Seat", "Rojo", 4, 1900, 120, 260, 6);
		Vehiculo camion=new Camion("4231SDD", 2, "SAB", "Blanco", 2, 2500, 180, 240, 6);
		System.out.println(coche);
		System.out.println(camion);
		trayecto(coche, 2, 62, 140000);

	}

	public static void trayecto(Vehiculo vehiculo, double tiempoInicial, double tiempoFinal, double distancia) {
		double velocidad;
		double tiempoTotal;
		/**
		 * @param tiempoInicial momento donde el vehiculo arranca, en MINUTOS
		 * @param tiempoFinal   momento donde se para el vehiculo,en MINUTOS
		 * @param tiempoTotal   cantidad de tiempo desde que se inicio y se paro el
		 *                      vehiculo, en HORAS
		 * @param distancia     recorrido que realizo el coche en METROS
		 * @param velocidad     variable que recogera el resultado de la velocidad
		 */
		if (tiempoInicial < tiempoFinal) {
			// Considero que la distancia es el espacio recorrido del vehiculo desde que
			// inicio hasta que paro, hacemos una conversión a KMs
			distancia = (distancia / 1000);
			// Calculo el tiempo total, convirtiendo el resultado de restar el tiempo
			// inicial, y el tiempo final en HORAS
			tiempoTotal = (tiempoFinal - tiempoInicial) / 60;
			velocidad = vehiculo.velocidad(distancia, tiempoTotal);

			if (velocidad <= vehiculo.getVelocidadMax()) {
				System.out.println("EL VEHICULO CIRCULA A : " + velocidad + " KM/H");
				
			} else {
				System.out.println("EL VEHICULO NO PUEDE CIRCULAR A ESA VELOCIDAD, EXPLOTO");
			}
		} else {
			System.out.println("El tiempo inicial debe ser menor que el Final!");
		}

	}

}

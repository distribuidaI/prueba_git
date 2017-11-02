package edu.undav.pdist.entities;

import edu.undav.pdist.server.ViolacionDePoliticaException;
import org.junit.Test;

public class PoliticaDNI10MillonesTest {

	@Test(expected = ViolacionDePoliticaException.class)
	public void chequearDNIMayorA10Millones() {
		PoliticaDNI10Millones politicaDNI10Millones = new PoliticaDNI10Millones();
		Empleado empleado = new Empleado("pepe", "309111911");
		politicaDNI10Millones.chequearValidez(empleado);
	}

	@Test
	public void chequearDNICorrecto() {
		PoliticaDNI10Millones politicaDNI10Millones = new PoliticaDNI10Millones();
		Empleado empleado = new Empleado("pepe", "3111911");
		politicaDNI10Millones.chequearValidez(empleado);
	}

	@Test
	public void chequearADiezMillones() {
		PoliticaDNI10Millones politicaDNI10Millones = new PoliticaDNI10Millones();
		Empleado empleado = new Empleado("pepe", "10000000");
		politicaDNI10Millones.chequearValidez(empleado);
	}


}

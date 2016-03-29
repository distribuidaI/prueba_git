package edu.undav.pdist.entities;

import org.junit.Test;

import edu.undav.pdist.server.ViolacionDePoliticaException;

public class PoliticaSoloDNITest {

	@Test
	public void chequearValidez() {
		PoliticaSoloDNI soloDni = new PoliticaSoloDNI();

		Empleado empleado = new Empleado("nombre", "30121212");
		soloDni.chequearValidez(empleado);

		// si llego hasta acá, no falló
	}

	// espera una excepción. El test da verde, si se lanza esa excepción
	@Test(expected = ViolacionDePoliticaException.class)
	public void chequearValidezNull() {
		PoliticaSoloDNI soloDni = new PoliticaSoloDNI();

		Empleado empleado = new Empleado("nombre", null);
		soloDni.chequearValidez(empleado);
	}

	// espera una excepción. El test da verde, si se lanza esa excepción
	@Test(expected = ViolacionDePoliticaException.class)
	public void chequearValidezEmptyString() {
		PoliticaSoloDNI soloDni = new PoliticaSoloDNI();

		Empleado empleado = new Empleado("nombre", " ");
		soloDni.chequearValidez(empleado);
	}

}

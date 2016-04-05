package edu.undav.pdist.entities;

import org.junit.Test;

import edu.undav.pdist.server.Politica;
import edu.undav.pdist.server.ViolacionDePoliticaException;

public class PoliticaNoHomerosTest {
	
	
	@Test
	public void chequearValidez() {
		Politica politica = new PoliticaNoHomeros();
		politica.chequearValidez(new Empleado("juanete", "12312321"));
		
		//no debería fallar, ya que NO se llama "homero". Si llega hasta acá, es un éxito
	}
	
	@Test(expected = ViolacionDePoliticaException.class)
	public void chequearValidezOtroNombre() {
		Politica politica = new PoliticaNoHomeros();
		politica.chequearValidez(new Empleado("homero", "12312321"));
	}
	
	@Test
	public void chequearValidezNull() {
		//es valido que sea null! Porque no es Homero!
		Politica politica = new PoliticaNoHomeros();
		politica.chequearValidez(new Empleado(null, "12312321"));
	}
	

}

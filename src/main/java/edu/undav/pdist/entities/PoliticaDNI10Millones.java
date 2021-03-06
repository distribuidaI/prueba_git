package edu.undav.pdist.entities;

import java.io.Serializable;

import edu.undav.pdist.server.Politica;
import edu.undav.pdist.server.ViolacionDePoliticaException;

public class PoliticaDNI10Millones extends PoliticaSoloDNI implements Politica, Serializable {
	private static final long serialVersionUID = 3891169171081225288L;

	@Override
	public void chequearValidez(Empleado empleado) throws ViolacionDePoliticaException {
		super.chequearValidez(empleado);

		final String stringDni = empleado.getDni();

		int dni = Integer.valueOf(stringDni);
		if (dni > 10000000) {
			throw new ViolacionDePoliticaException("El DNI debe ser menor a 10 millones");
		}

	}

}

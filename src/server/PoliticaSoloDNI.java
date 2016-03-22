package server;

import java.io.Serializable;

import entities.Empleado;

public class PoliticaSoloDNI implements Politica, Serializable {
	private static final long serialVersionUID = 3891169171081225288L;

	@Override
	public void chequearValidez(Empleado empleado) throws ViolacionDePoliticaException {
		if (empleado.getDni() == null || empleado.getDni().trim().equals(""))
			throw new ViolacionDePoliticaException("No tiene DNI asignado");
	}

}

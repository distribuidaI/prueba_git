package entities;

import java.io.Serializable;

import server.Politica;
import server.ViolacionDePoliticaException;

public class PoliticaNoHomeros implements Politica, Serializable {
	private static final long serialVersionUID = 3891169171081225288L;

	@Override
	public void chequearValidez(Empleado empleado) throws ViolacionDePoliticaException {
		if (empleado.getNombre() != null && empleado.getNombre().equalsIgnoreCase("homero"))
			throw new ViolacionDePoliticaException("Este es el club de los no homeros");
	}

}

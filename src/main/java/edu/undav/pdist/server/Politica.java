package edu.undav.pdist.server;

import edu.undav.pdist.entities.Empleado;

public interface Politica {
	
	void chequearValidez(Empleado empleado)
	        throws ViolacionDePoliticaException;

}

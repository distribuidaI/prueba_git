package server;

import entities.Empleado;

public interface Politica {
	
	void chequearValidez(Empleado empleado)
	        throws ViolacionDePoliticaException;

}

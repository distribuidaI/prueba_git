package edu.undav.pdist.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import edu.undav.pdist.entities.Empleado;

public interface ServidorEmpleado extends Remote {

	void agregarEmpleado(Empleado empleado) throws RemoteException;
	
	List<Empleado> getEmpleados() throws RemoteException;
	
	Politica getPolicy() throws RemoteException;
	
}

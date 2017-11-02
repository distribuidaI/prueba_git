package edu.undav.pdist.server;

import edu.undav.pdist.entities.Empleado;
import edu.undav.pdist.entities.PoliticaDNI10Millones;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ServidorEmpleadoImpl extends UnicastRemoteObject implements ServidorEmpleado {

	private static final long serialVersionUID = 1L;

	private Map<String, Empleado> empleados;
	
	protected ServidorEmpleadoImpl() throws RemoteException {
		super();
		this.empleados = new HashMap<>();
		String dni = "30911912";
		this.empleados.put(dni, new Empleado("Juan Lagostena", dni));
	}

	@Override
	public void agregarEmpleado(Empleado empleado) throws RemoteException {
		this.empleados.put(empleado.getDni(), empleado);
	}

	@Override
	public List<Empleado> getEmpleados() throws RemoteException {
		return new ArrayList<>(empleados.values());
	}

	@Override
	public Politica getPolicy() throws RemoteException {
		return new PoliticaDNI10Millones();
	}
	
	

}

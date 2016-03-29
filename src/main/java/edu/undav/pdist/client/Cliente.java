package edu.undav.pdist.client;

import java.rmi.Naming;

import edu.undav.pdist.entities.Empleado;
import edu.undav.pdist.server.Politica;
import edu.undav.pdist.server.ServidorEmpleado;
import edu.undav.pdist.server.ViolacionDePoliticaException;

public class Cliente {

	public static void main(String[] args) throws Exception {

		ServidorEmpleado servidorEmpleado = (ServidorEmpleado) Naming.lookup("servidor_empleado");
		Politica policy = servidorEmpleado.getPolicy();
		
		Empleado empleado = new Empleado("Homero", "30911912");
		try {
			policy.chequearValidez(empleado);
			servidorEmpleado.agregarEmpleado(empleado);
			System.out.println("Empleado agregado");
		} catch (ViolacionDePoliticaException ex) {
			System.out.println(
					"Empleado " + empleado.getNombre() + " no cumple con los requerimientos." + ex.getMessage());
		}
	}
}

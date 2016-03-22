package client;

import java.rmi.Naming;

import entities.Empleado;
import server.Politica;
import server.ViolacionDePoliticaException;
import server.ServidorEmpleado;

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

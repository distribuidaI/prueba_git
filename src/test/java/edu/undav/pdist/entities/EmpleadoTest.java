package edu.undav.pdist.entities;

import org.junit.Assert;
import org.junit.Test;

public class EmpleadoTest {

	@Test
	public void newEmpleado() {
		//nos fijamos que el constructor deje al objeto en el estado que nosotros queremos
		String dni = "12321321";
		String nombre = "nombre";
		
		Empleado empleado = new Empleado(nombre, dni);
		
		Assert.assertEquals(dni, empleado.getDni());
		Assert.assertEquals(nombre, empleado.getNombre());
	}
}

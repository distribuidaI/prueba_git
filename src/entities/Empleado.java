package entities;

import java.io.Serializable;

public class Empleado implements Serializable {
	
	private static final long serialVersionUID = -678600302046367769L;
	
	private String nombre;
	private String dni;

	public Empleado(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

}

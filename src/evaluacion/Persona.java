package evaluacion;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private int edad;
	private ArrayList<Persona> familiar;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.familiar = new ArrayList<Persona>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void agregarFamiliar(Persona P) {
		this.familiar.add(P);
	}
	
}

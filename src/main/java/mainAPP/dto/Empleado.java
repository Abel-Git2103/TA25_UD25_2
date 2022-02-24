package mainAPP.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

	@Id
	private String DNI;
	private String nombre;
	private String apellidos;

	@ManyToOne
	@JoinColumn(name = "departamento")
	private Departamento departamento;

	// CONSTRUCTORES
	public Empleado() {
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param departamento
	 */
	public Empleado(String dni, String nombre, String apellidos, Departamento departamento) {		
		this.DNI = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento = departamento;
	}

	// GETTERS Y SETTERS
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dni) {
		this.DNI = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	// METODO TO STRING
	@Override
	public String toString() {
		return "Empleado [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", departamento="
				+ departamento + "]";
	}
}

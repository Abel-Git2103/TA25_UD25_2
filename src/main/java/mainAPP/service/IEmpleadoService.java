package mainAPP.service;

import java.util.List;
import mainAPP.dto.Empleado;

public interface IEmpleadoService {

	public List<Empleado> listarEmpleado(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado empleado);	//Guarda un empleado CREATE
	
	public Empleado empleadoXID(String id); //Leer datos de un empleado READ
	
	public List<Empleado> listarEmpleadoNombre(String nombre);//Listar empleado por campo nombre
	
	public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del empleado UPDATE
	
	public void eliminarEmpleado(String id);// Elimina el empleado DELETE
}

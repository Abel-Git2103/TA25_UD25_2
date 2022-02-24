package mainAPP.service;

import java.util.List;
import mainAPP.dto.Departamento;

public interface IDepartamentoService {

	public List<Departamento> listarDepartamento(); //Listar All 
	
	public Departamento guardarDepartamento(Departamento departamento);	//Guarda un Departamento CREATE
	
	public Departamento departamentoXID(Long codigo); //Leer datos de un Departamento READ
	
	public List<Departamento> listarDepartamentoNombre(String nombre);//Listar Departamento por campo nombre
	
	public Departamento actualizarDepartamento(Departamento departamento); //Actualiza datos del Departamento UPDATE
	
	public void eliminarDepartamento(Long codigo);// Elimina el Departamento DELETE
}

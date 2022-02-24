package mainAPP.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mainAPP.dao.IDepartamentoDao;
import mainAPP.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

	@Autowired
	IDepartamentoDao iDepartamentoDao;
	
	@Override
	public List<Departamento> listarDepartamento() {
		return iDepartamentoDao.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		return iDepartamentoDao.save(departamento);
	}

	@Override
	public Departamento departamentoXID(Long dni) {
		return iDepartamentoDao.findById(dni).get();
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		return iDepartamentoDao.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Long dni) {
		iDepartamentoDao.deleteById(dni);
	}

	@Override
	public List<Departamento> listarDepartamentoNombre(String nombre) {
		return iDepartamentoDao.findByNombre(nombre);
	}
}

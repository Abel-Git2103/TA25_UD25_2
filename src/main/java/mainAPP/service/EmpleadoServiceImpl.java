package mainAPP.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mainAPP.dao.IEmpleadoDao;
import mainAPP.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadoDao iEmpleadoDao;

	@Override
	public List<Empleado> listarEmpleado() {
		return iEmpleadoDao.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {

		return iEmpleadoDao.save(empleado);
	}

	@Override
	public Empleado empleadoXID(String dni) {

		return iEmpleadoDao.findById(dni).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {

		return iEmpleadoDao.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String dni) {

		iEmpleadoDao.deleteById(dni);

	}

	@Override
	public List<Empleado> listarEmpleadoNombre(String nombre) {

		return iEmpleadoDao.findByNombre(nombre);
	}
}

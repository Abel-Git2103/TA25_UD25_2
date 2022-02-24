package mainAPP.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mainAPP.dto.Empleado;
import mainAPP.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;

	@GetMapping("/empleados")
	public List<Empleado> listarEmpleado() {
		return empleadoServiceImpl.listarEmpleado();
	}

	// listar Empleado por campo nombre
	@GetMapping("/empleados/nombre/{nombre}")
	public List<Empleado> listarEmpleadoNombre(@PathVariable(name = "nombre") String nombre) {
		return empleadoServiceImpl.listarEmpleadoNombre(nombre);
	}

	@PostMapping("/empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {

		return empleadoServiceImpl.guardarEmpleado(empleado);
	}

	@GetMapping("/empleados/{id}")
	public Empleado empleadoXID(@PathVariable(name = "id") String dni) {

		Empleado empleado_xid = new Empleado();

		empleado_xid = empleadoServiceImpl.empleadoXID(dni);

		System.out.println("Empleado XID: " + empleado_xid);

		return empleado_xid;
	}

	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name = "id") String dni, @RequestBody Empleado empleado) {

		Empleado empleado_seleccionado = new Empleado();
		Empleado empleado_actualizado = new Empleado();

		empleado_seleccionado = empleadoServiceImpl.empleadoXID(dni);

		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());

		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);

		System.out.println("El empleado actualizado es: " + empleado_actualizado);

		return empleado_actualizado;
	}

	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name = "id") String dni) {
		empleadoServiceImpl.eliminarEmpleado(dni);
	}

}

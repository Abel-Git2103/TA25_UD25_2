package mainAPP.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import mainAPP.dto.Departamento;

public interface IDepartamentoDao extends JpaRepository<Departamento, Long> {

	public List<Departamento> findByNombre(String nombre);
}

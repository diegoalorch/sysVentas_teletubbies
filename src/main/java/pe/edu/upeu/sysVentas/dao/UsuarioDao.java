package pe.edu.upeu.sysVentas.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysVentas.entity.Usuario;

public interface UsuarioDao {
	
	int create (Usuario user);
	int update (Usuario user);
	int delete (int id);
	Usuario read (int id);
	List<Map<String, Object>>readAll();
}

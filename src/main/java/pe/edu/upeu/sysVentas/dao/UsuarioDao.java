package pe.edu.upeu.sysVentas.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysVentas.entity.Usuario;

public interface UsuarioDao {
	
	public Usuario read(String nomuser);
	public int update(Usuario user);
	public int create(Usuario user);
	public int delete(int idusuario);
	List<Map<String, Object>> readAll();
}

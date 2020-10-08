package pe.edu.upeu.sysVentas.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysVentas.entity.Persona;

public interface PersonaDao {
	int create(Persona p);
	int update(Persona p);
	int delete(int id);
	Persona read(int id);
	List<Map<String, Object>> readAll();
}

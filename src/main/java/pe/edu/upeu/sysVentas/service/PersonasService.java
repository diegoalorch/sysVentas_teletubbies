package pe.edu.upeu.sysVentas.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysVentas.entity.Persona;

public interface PersonasService {
	int create(Persona p);
	int update(Persona p);
	int delete(int id);
	Persona read(int id);
	List<Map<String, Object>> readAll();
}

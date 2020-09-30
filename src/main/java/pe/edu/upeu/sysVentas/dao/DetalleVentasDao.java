package pe.edu.upeu.sysVentas.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysVentas.entity.DetalleVentas;

public interface DetalleVentasDao {
	
	int create(DetalleVentas dv);
	int updtae(DetalleVentas dv);
	int delete(int id);
	DetalleVentas read(int id);
	List<Map<String, Object>>readAll();
	
}

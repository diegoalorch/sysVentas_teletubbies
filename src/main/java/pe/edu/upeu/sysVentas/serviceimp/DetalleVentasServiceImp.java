package pe.edu.upeu.sysVentas.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysVentas.dao.DetalleVentasDao;
import pe.edu.upeu.sysVentas.entity.DetalleVentas;
import pe.edu.upeu.sysVentas.service.DetalleVentasService;
@Service
public class DetalleVentasServiceImp implements DetalleVentasService {
	@Autowired
	private DetalleVentasDao detalleventasDao;

	@Override
	public int create(DetalleVentas dv) {
		// TODO Auto-generated method stub
		return detalleventasDao.create(dv);
	}

	@Override
	public int updtae(DetalleVentas dv) {
		// TODO Auto-generated method stub
		return detalleventasDao.updtae(dv);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return detalleventasDao.delete(id);
	}

	@Override
	public DetalleVentas read(int id) {
		// TODO Auto-generated method stub
		return detalleventasDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detalleventasDao.readAll();
	}

}

package pe.edu.upeu.sysVentas.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysVentas.dao.ProductoDao;
import pe.edu.upeu.sysVentas.entity.Producto;
import pe.edu.upeu.sysVentas.service.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService{
@Autowired
private ProductoDao productoDao;

@Override
public int create(Producto p) {
	// TODO Auto-generated method stub
	return productoDao.create(p);
}

@Override
public int update(Producto p) {
	// TODO Auto-generated method stub
	return productoDao.update(p);
}

@Override
public int delete(int id) {
	// TODO Auto-generated method stub
	return productoDao.delete(id);
}

@Override
public Producto read(int id) {
	// TODO Auto-generated method stub
	return productoDao.read(id);
}

@Override
public List<Map<String, Object>> readAll() {
	// TODO Auto-generated method stub
	return productoDao.readAll();
}

}

package pe.edu.upeu.sysVentas.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysVentas.dao.ProductoDao;
import pe.edu.upeu.sysVentas.entity.Producto;
@Repository
public class ProductoDaoImp implements ProductoDao{
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Producto p) {
		// TODO Auto-generated method stub
		String SQL = "insert into producto(nomprod, precio, cantidad) values(?, ? ,?)";
		return jdbcTemplate.update(SQL,p.getNomprod(),p.getPrecio(),p.getCantidad());
	}

	@Override
	public int update(Producto p) {
		// TODO Auto-generated method stub
		String SQL = "update producto set nomprod=?where, precio=?where, cantidad=?where idproducto=?";
		return jdbcTemplate.update(SQL,p.getNomprod(),p.getPrecio(),p.getCantidad(),p.getIdproducto());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from producto where idproducto=?";
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select * from producto";
		return jdbcTemplate.queryForList(SQL);
	}

}

package pe.edu.upeu.sysVentas.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysVentas.dao.DetalleVentasDao;
import pe.edu.upeu.sysVentas.entity.DetalleVentas;
import pe.edu.upeu.sysVentas.entity.Rol;

@Repository
public class DetalleVentasDaoImp implements DetalleVentasDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(DetalleVentas dv) {
		// TODO Auto-generated method stub
		String SQL = "insert into detalle_ventas(precio, cantidad, subtotal, idventas, idproducto)"+
					 "values(?,?,?,?,?)";
		return jdbcTemplate.update(SQL,dv.getPrecio(), dv.getCantidad(), dv.getSubtotal(),
									dv.getIdventas(), dv.getIdproducto());
	}

	@Override
	public int updtae(DetalleVentas dv) {
		// TODO Auto-generated method stub
		String SQL = "update detalle_ventas set precio = ?, cantidad=?, subtotal=?, idventas"+
						"idproducto=? where iddetalle_ventas=?";
		
		return jdbcTemplate.update(SQL,dv.getPrecio(), dv.getCantidad(), dv.getSubtotal(),
									dv.getIdventas(), dv.getIdproducto(), dv.getIddetalle_ventas());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from detalle_ventas where iddetalle_ventas = ?";
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public DetalleVentas read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from detalle_ventas where iddetalle_ventas=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new
				BeanPropertyRowMapper<DetalleVentas>(DetalleVentas.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select * from detalle_ventas";
		return jdbcTemplate.queryForList(SQL);
	}
	
	
}

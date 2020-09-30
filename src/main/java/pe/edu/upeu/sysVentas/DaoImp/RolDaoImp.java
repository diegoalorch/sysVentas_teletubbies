package pe.edu.upeu.sysVentas.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysVentas.dao.RolDao;
import pe.edu.upeu.sysVentas.entity.Rol;

@Repository

public class RolDaoImp implements RolDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Rol r) {
		// TODO Auto-generated method stub
		String SQL = "insert into rol(nomrol)values(?)";
		return jdbcTemplate.update(SQL,r.getNomrol());
	}

	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		String SQL = "update rol set nomrol=? where idrol=?";
		
		return jdbcTemplate.update(SQL, r.getNomrol(), r.getIdrol());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from rol where idrol=?";
		
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select *from rol where idrol=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Rol>(Rol.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select *from rol";
		return jdbcTemplate.queryForList(SQL);
	}
}

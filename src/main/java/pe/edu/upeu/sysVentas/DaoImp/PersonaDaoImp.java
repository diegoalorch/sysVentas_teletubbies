package pe.edu.upeu.sysVentas.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysVentas.dao.PersonaDao;
import pe.edu.upeu.sysVentas.entity.Persona;
@Repository
public class PersonaDaoImp implements PersonaDao{
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Persona p) {
		// TODO Auto-generated method stub
		String SQL = "Insert into persona(nombres, apellidos, dni) values(?,?,?)";
		return jdbcTemplate.update(SQL,p.getNombre(),p.getApellidos(),p.getDni());
	}

	@Override
	public int update(Persona p) {
		// TODO Auto-generated method stub
		String SQL = "update rol set nombres=? where apellidos=? where dni=? where idpersona=?";
		return jdbcTemplate.update(SQL,p.getNombre(),p.getApellidos(),p.getDni(),p.getIdpersona());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from persona where idpersona=?";
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select * from persona";
		return jdbcTemplate.queryForList(SQL);
	}
	
}

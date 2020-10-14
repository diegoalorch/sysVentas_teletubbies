package pe.edu.upeu.sysVentas.DaoImp;


import java.util.List;
import java.util.Map;

import  org.springframework.beans.factory.annotation.Autowired ;
import  org.springframework.jdbc.core.BeanPropertyRowMapper ;
import  org.springframework.jdbc.core.JdbcTemplate ;
import  org.springframework.stereotype.Repository ;

import pe.edu.upeu.sysVentas.dao.UsuarioDao;
import pe.edu.upeu.sysVentas.entity.Usuario;

@Repository
public class UsuarioDaoImp implements UsuarioDao {

	@Autowired
	private  JdbcTemplate jdbcTemplate;
		@Override
		public  Usuario  read ( String  nomuser ) {
			String SQL = "select *from usuario where nomuser=?";
			return jdbcTemplate.queryForObject(SQL, new Object [] {nomuser}, new  BeanPropertyRowMapper<Usuario> (Usuario.class));
		}
		@Override
		public int update(Usuario user) {
			System.out.println(user.getIdusuario() + " / " + user.getIdpersona() + 
							   " / " +user.getNomuser() + " / " + user.getClave() +
							   " / " + user.getEstado() + " / " + user.getIdrol());
			String SQL = "UPDATE usuario SET idusuario = ?, idpersona = ?, nomuser = ?, clave = ?, estado = ?, idrol = ? WHERE idusuario = ?";
			return jdbcTemplate.update(SQL, user.getIdusuario(), user.getIdpersona(), user.getNomuser(), user.getClave(), user.getEstado(), user.getIdrol());
		}
		@Override
		public int create(Usuario user) {
			// TODO Auto-generated method stub
			String SQL = "INSERT INTO usuario (idpersona, nomuser, clave, estado, idrol) VALUES (?, ?, ?, ?, ?);";
			return jdbcTemplate.update(SQL, user.getIdpersona(), user.getNomuser(), user.getClave(), user.getEstado(), user.getIdrol());
		}
		@Override
		public int delete(int idusuario) {
			// TODO Auto-generated method stub
			String SQL = "delete from usuario where idusuario=?";
			return jdbcTemplate.update(SQL, idusuario);
		}
		@Override
		public List<Map<String, Object>> readAll() {
			// TODO Auto-generated method stub
			String SQL = "select *from usuario";
			return jdbcTemplate.queryForList(SQL);
		}
}

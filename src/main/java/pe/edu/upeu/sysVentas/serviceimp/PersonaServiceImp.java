package pe.edu.upeu.sysVentas.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysVentas.dao.PersonaDao;
import pe.edu.upeu.sysVentas.entity.Persona;
import pe.edu.upeu.sysVentas.service.PersonasService;
@Service
public class PersonaServiceImp implements PersonasService{
@Autowired
private PersonaDao personaDao;
	@Override
	public int create(Persona p) {
		// TODO Auto-generated method stub
		return personaDao.create(p);
	}

	@Override
	public int update(Persona p) {
		// TODO Auto-generated method stub
		return personaDao.update(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return personaDao.delete(id);
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return personaDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return personaDao.readAll();
	}
	
}

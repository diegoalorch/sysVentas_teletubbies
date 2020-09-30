package pe.edu.upeu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.sysVentas.dao.RolDao;
import pe.edu.upeu.sysVentas.entity.Rol;

@SpringBootTest
class SysVentasTeletubbiesApplicationTests {

	@Autowired
	private RolDao rolDao;
	
	@Test
	void contextLoads() {
		
		Rol r = new Rol();
		r.setNomrol("Diego");
		System.out.println(rolDao.create(r));
		
	}

/*	@Test
	void contextLoadss() {
		Rol r = new Rol();
		r.setIdrol(3);
		r.setNomrol("GV");
		/*
		r.setNomrol("Henry");*/
		//System.out.println(rolDao.create(r));
	//System.out.println(rolDao.update(r));
}

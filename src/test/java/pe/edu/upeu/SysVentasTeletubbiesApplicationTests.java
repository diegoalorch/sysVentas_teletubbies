package pe.edu.upeu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import pe.edu.upeu.sysVentas.dao.RolDao;
import pe.edu.upeu.sysVentas.entity.Rol;

import pe.edu.upeu.sysVentas.dao.VentasDao;
import pe.edu.upeu.sysVentas.entity.Ventas;

@SpringBootTest
class SysVentasTeletubbiesApplicationTests {

	@Autowired
	private RolDao rolDao;
	
	@Autowired
	private VentasDao ventasDao;
	
	@Test
	void contextLoads() {
		
		Rol r = new Rol();
		r.setNomrol("Diego");
		System.out.println(rolDao.create(r));

		Ventas v = new Ventas();
		
		/*v.setIdventas(3);
		v.setFecha("26-09-2020");
		v.setTipodoc("Boleta");
		v.setNumdoc("060608");
		v.setIdpersona(1);
		v.setIdcliente(1);
		*/
		
		v.setIdventas(6);
		v.setFecha("30-09-2020");
		v.setTipodoc("Boleta");
		v.setNumdoc("050504");
		v.setIdpersona(1);
		v.setIdcliente(1);
		
		
		System.out.println(ventasDao.read(6));
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

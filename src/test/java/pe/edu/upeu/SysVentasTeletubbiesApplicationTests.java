package pe.edu.upeu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.sysVentas.dao.PersonaDao;
import pe.edu.upeu.sysVentas.dao.ProductoDao;
import pe.edu.upeu.sysVentas.dao.RolDao;
import pe.edu.upeu.sysVentas.entity.Persona;
import pe.edu.upeu.sysVentas.entity.Producto;
import pe.edu.upeu.sysVentas.entity.Rol;

@SpringBootTest
class SysVentasTeletubbiesApplicationTests {
@Autowired
/*private RolDao rolDao;
	@Test
	void contextLoads() {
		Rol r = new Rol();
		//r.setIdrol(2);
		//r.setNomrol("Henrry Orbezo");
		r.setNomrol("Teddy S");
		//System.out.println(rolDao.create(r));
		System.out.println(rolDao.readAll());
	}*/
/*private PersonaDao personaDao;
	@Test
	void contextLoads() {
		Persona p = new Persona();
		p.setNombre("Sett");
		p.setApellidos("Mecha");
		p.setDni(12121212);
		System.out.println(personaDao.readAll());
	}*/
private ProductoDao productoDao;
	@Test
	void contextLoads() {
		Producto p = new Producto();
		p.setIdproducto(2);
		p.setNomprod("jabon bolivar");
		p.setPrecio(4);
		p.setCantidad(1);
		System.out.println(productoDao.readAll());
	}
}

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
		//r.setIdrol(2);
		//r.setNomrol("Henrry Orbezo");
		r.setNomrol("Teddy S");
		//System.out.println(rolDao.create(r));
		System.out.println(rolDao.readAll());
	}

}

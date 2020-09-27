package pe.edu.upeu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.sysVentas.dao.VentasDao;
import pe.edu.upeu.sysVentas.entity.Ventas;

@SpringBootTest
class SysVentasTeletubbiesApplicationTests {
	@Autowired
	private VentasDao ventasDao;
	@Test
	void contextLoads() {
		
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

}

package pe.edu.upeu.sysVentas.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sysVentas.entity.DetalleVentas;
import pe.edu.upeu.sysVentas.service.DetalleVentasService;

@RestController
@RequestMapping("/detallev")
public class DetalleVentasController {

	@Autowired
	private DetalleVentasService detalleventasService;
	
	@GetMapping("/reporte")
	public List<Map<String, Object>> Reporte(){
		return detalleventasService.readAll();
	}
	
	@GetMapping("/reporte/{id}")
	public DetalleVentas read(@PathVariable int id) {
		return detalleventasService.read(id);
	}
	
	@GetMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return detalleventasService.delete(id);
	}
	
	@PostMapping("/dventas")
	public int create(@RequestBody DetalleVentas dv) {
		return detalleventasService.create(dv);
	}
	
	@PutMapping("/edit/{id}")
	public String edit(@RequestBody DetalleVentas dv, @PathVariable int id) {
		DetalleVentas dventa = detalleventasService.read(id);
		dventa.setPrecio(dv.getPrecio());
		dventa.setCantidad(dv.getCantidad());
		dventa.setSubtotal(dv.getSubtotal());
		dventa.setIdventas(dv.getIdventas());
		dventa.setIdproducto(dv.getIdproducto());
		String mensaje;
		if(detalleventasService.updtae(dventa)==1) {
			mensaje ="Modificado Correctamente..!";
		}else {
			mensaje ="No Modificado...!";
		}
		return mensaje;
	}
}

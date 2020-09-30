package pe.edu.upeu.sysVentas.controller;

import java.nio.file.Path;
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

import pe.edu.upeu.sysVentas.entity.Ventas;
import pe.edu.upeu.sysVentas.service.VentasService;

@RestController
@RequestMapping("/ventas")
public class VentasController {
	@Autowired
	private VentasService ventasService;
	
	@GetMapping("/reporte")
	public List<Map<String, Object>> Reporte(){
		return ventasService.readAll();
	}
	
	@GetMapping("/reporte/{id}")
	public Ventas read(@PathVariable int id) {
		return ventasService.read(id);
	}
	
	@GetMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return ventasService.delete(id);
	}
	
	@PostMapping("/cobrar")
	public int create(@RequestBody Ventas v) {
		return ventasService.create(v);
	}
	
	@PutMapping("/edit/{id}")
	public String edit(@RequestBody Ventas v, @PathVariable int id) {
		Ventas venta = ventasService.read(id);
		venta.setFecha(v.getFecha());
		venta.setTipodoc(v.getTipodoc());
		venta.setNumdoc(v.getNumdoc());
		venta.setIdpersona(v.getIdpersona());
		venta.setIdcliente(v.getIdcliente());
		String mensaje;
		if(ventasService.update(venta)==1) {
			mensaje ="Modificado Correctamente..!";
		}else {
			mensaje ="No Modificado...!";
		}
		return mensaje;
	}
	

}

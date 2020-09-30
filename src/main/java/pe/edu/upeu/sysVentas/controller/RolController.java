package pe.edu.upeu.sysVentas.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sysVentas.entity.Rol;
import pe.edu.upeu.sysVentas.service.RolService;

@RestController
@RequestMapping("/roles")
public class RolController {
	
	@Autowired
	private RolService rolService;
	
	@GetMapping("/lista")
	public List<Map<String, Object>> lista(){
		return rolService.readAll();
	}
	
	@GetMapping("/{id}")
	public Rol read(@PathVariable int id ) {
		return rolService.read(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id ) {
		return rolService.delete(id);
	}
	
//PostMapping permite registrar un nuevo rol
	@PostMapping("/rol")
	public int create(@RequestBody Rol r) {
		return rolService.create(r);
	}
	
//PutMappin permite modificar rol
@PutMapping("/rol/{id}")
	public String edit(@RequestBody Rol r, @PathVariable int id) {
		Rol rol = rolService.read(id);
		rol.setNomrol(r.getNomrol());
		String mensaje = "";
		if(rolService.update(rol)==1) {
			mensaje ="Rol se modificó correctamente..!";
		}else {
			mensaje = "Rol no se modifico.!";
		}
		return mensaje;
	}
}
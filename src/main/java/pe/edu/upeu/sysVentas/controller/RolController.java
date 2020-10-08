package pe.edu.upeu.sysVentas.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}

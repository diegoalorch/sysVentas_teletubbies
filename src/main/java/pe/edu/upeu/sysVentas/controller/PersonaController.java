package pe.edu.upeu.sysVentas.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sysVentas.service.PersonasService;

@RestController
@RequestMapping("/persona")
public class PersonaController{
@Autowired
private PersonasService personasService;
@GetMapping("/lista")
public List<Map<String, Object>> lista(){
	return personasService.readAll();
}
}

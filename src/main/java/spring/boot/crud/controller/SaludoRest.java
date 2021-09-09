package spring.boot.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaludoRest {
	

	@GetMapping("/")
	public String hola() {
		
		String hola = "hola, es un gusto saludarte ";
		
		
		
		return "<h1>"+ hola+"</h1>";
	}
	
	@GetMapping("/saludo/{nombre}")
	String saludo( @PathVariable String nombre) {
		
		String hola = "hola, es un gusto saludarte "+nombre;
		
		
		
		return hola;
	}	
	

}

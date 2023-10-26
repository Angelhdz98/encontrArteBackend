package com.encontrarte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.encontrarte.model.Obra;
import com.encontrarte.service.ObraService;

@RestController //Decimos que es una API
@RequestMapping(path="products/obras")
@CrossOrigin(origins="*", methods= {RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.POST })
public class ObraController {
	// instanciamos un objeto constante de clase ObraService
	private final ObraService obraService;
	//Constructor que toma el objeto Service y luego indica que aquí se llevará a cabo alguna inyección 
	@Autowired
	public ObraController(ObraService obraService) {
		this.obraService= obraService;
		}
	
	public List<Obra> getObras(){
		return obraService.getObras();
	}
	
}

package com.temperatura.apirest.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.temperatura.apirest.models.Temperatura;
import com.temperatura.apirest.repository.TemperaturaRepository;

@RestController
@RequestMapping(value = "/api")
public class TemperaturaResources {

	@Autowired
	TemperaturaRepository temperaturaRepository;

	@GetMapping("/temperatura")

	public List <Temperatura> listaTemperaturas() {
		return temperaturaRepository.findAll();
	}
	
	@GetMapping("/temperatura/listar/{id}")
	public Object listaTemperaturaUnica(@PathVariable(value = "id") long id) {
		return temperaturaRepository.findById(id);
	}
}



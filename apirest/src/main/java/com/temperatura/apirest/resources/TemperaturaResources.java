package com.temperatura.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.temperatura.apirest.models.Temperatura;
import com.temperatura.apirest.repository.TemperaturaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Temperatura")
@CrossOrigin(origins = "*")

public class TemperaturaResources {

	@Autowired
	TemperaturaRepository temperaturaRepository;

	@GetMapping("/temperatura")
	@ApiOperation(value = "Retorna uma lista de temperaturas")
	public List<Temperatura> listaTemperaturas() {
		return temperaturaRepository.findAll();
	}

	@GetMapping("/temperatura/listar/{id}")
	@ApiOperation(value = "Retorna uma temperatura a partir do ID")
	public Object listaTemperaturaUnica(@PathVariable(value = "id") long id) {
		return temperaturaRepository.findById(id);
	}

	@PostMapping("/temperatura/salvar")
	@ApiOperation(value = "Salva uma temperatura")
	public Temperatura salvaProduto(@RequestBody Temperatura temperatura) {
		return temperaturaRepository.save(temperatura);
	}

	@DeleteMapping("/temperatura/deletar")
	@ApiOperation(value = "Deleta uma temperatura")
	public void deletaTemperatura(@RequestBody Temperatura temperatura) {
		temperaturaRepository.delete(temperatura);
	}

	@PutMapping("/temperatura/atualizar")
	@ApiOperation(value = "Atualiza uma temperatura")

	public Temperatura atualizaTemperatura(@RequestBody Temperatura temperatura) {
		return temperaturaRepository.save(temperatura);
	}

}

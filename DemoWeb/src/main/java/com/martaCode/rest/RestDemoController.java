package com.martaCode.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martaCode.model.Persona;
import com.martaCode.repo.IPersonaRepo;

@RestController
@RequestMapping("/personas")
public class RestDemoController {

	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping
	public List<Persona> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar (@RequestBody Persona per) {
		repo.save(per);
	}
	
	//TODO Arreglar
	@PutMapping(value="/{id}")
	public void editar ( @RequestBody Persona pPer) {
//		Optional<Persona> personas = repo.findById(id);
//		Persona per = new Persona();
//		if(personas.isPresent()) {
//			per = personas.get();
//			per.setNombre(pPer.getNombre());
//			per.setCodigo(id);
//		}
		repo.save(pPer);
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar (@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}
	
}

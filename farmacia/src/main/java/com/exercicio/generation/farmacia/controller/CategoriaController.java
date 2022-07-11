package com.exercicio.generation.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.generation.farmacia.model.Categoria;
import com.exercicio.generation.farmacia.repository.CategoriaRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@PostMapping
	 public ResponseEntity<Categoria> post(@RequestBody Categoria categoria){
		Categoria categoriaCadastrada = categoriaRepository.save(categoria);
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaCadastrada);
	}
	
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll(){
		List<Categoria> categorias = categoriaRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(categorias);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getById(@PathVariable long id){
		return categoriaRepository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
}

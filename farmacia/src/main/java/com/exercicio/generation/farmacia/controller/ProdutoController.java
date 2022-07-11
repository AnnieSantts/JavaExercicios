package com.exercicio.generation.farmacia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.generation.farmacia.model.Produto;
import com.exercicio.generation.farmacia.repository.ProdutoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	public ResponseEntity<Produto> post(@RequestBody Produto produto){
		Produto produtoCadastrado = produtoRepository.save(produto);
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoCadastrado);
	}

}

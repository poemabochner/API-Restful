package org.serratec.backend.exercicio01.controller;

import java.util.List;
import java.util.Optional;

import org.serratec.backend.exercicio01.domain.Produto;
import org.serratec.backend.exercicio01.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public List<Produto> listar(){
		return produtoRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> pesquisar(@PathVariable Long id){
	Optional<Produto> produto = produtoRepository.findById(id);
	if (produto.isPresent()) {
	return ResponseEntity.ok(produto.get());
	}
	return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Produto inserir(@RequestBody Produto produto) {
	return produtoRepository.save(produto);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Produto> atualizar(@RequestBody Produto produto, @PathVariable Long id) {
	Optional<Produto> produtoOptional = produtoRepository.findById(id);
	if (!produtoOptional.isPresent()) {
	return ResponseEntity.notFound().build();
	}
	Produto produtoDB = produtoOptional.get();
	produtoDB.setDescricao(produto.getDescricao());
	produtoDB.setDataCadastro(produto.getDataCadastro());
	produtoDB.setValor(produto.getValor());
	produto = produtoRepository.save(produtoDB);
	return ResponseEntity.ok(produto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
	if (!produtoRepository.existsById(id)) {
	return ResponseEntity.notFound().build();
	}
	produtoRepository.deleteById(id);
	return ResponseEntity.noContent().build();
	}
}

package org.serratec.backend.exercicio01.controller;

import java.util.ArrayList;
import java.util.List;

import org.serratec.backend.exercicio01.domain.Aluno;
import org.serratec.backend.exercicio01.domain.Veiculo;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

	public static List<Veiculo> veiculos = new ArrayList<>();
	static {
		veiculos.add(new Veiculo(1, "Audi", "A3"));
		veiculos.add(new Veiculo(2, "Audi", "RS6"));
		veiculos.add(new Veiculo(3, "BMW", "G30"));
	}
	
	@GetMapping
	public List<Veiculo> listaVeiculos(){
		return veiculos;
	}
	
	@GetMapping("/{id}")
	public Veiculo buscaVeiculo(@PathVariable Integer id) {
		for (int i = 0; i < veiculos.size(); i++) {
			Veiculo veiculo = veiculos.get(i);
			if (veiculo.getId().equals(id)) {
				return veiculo;
			}
		}
		return null;
	}
	
	@PostMapping
	public Veiculo inserir(@RequestBody Veiculo veiculo) {
		veiculos.add(veiculo);
		return veiculo;
	}
	
	@DeleteMapping("/{id}")
	public void apagar(@PathVariable Integer Id) {
		for (int i = 0; i < veiculos.size(); i++) {
			Veiculo veiculo = veiculos.get(i);
			if (veiculo.getId().equals(Id)) {
				veiculos.remove(i);
				return;
			}
		}
	}
	
	@PutMapping("/{id}")
	public Veiculo atualizar(@PathVariable Integer Id, @RequestBody Veiculo veiculo) {
		for (int i = 0; i < veiculos.size(); i++) {
			Veiculo veiculoLista = veiculos.get(i);
			if (veiculoLista.getId().equals(Id)) {
				veiculoLista.setMarca(veiculo.getMarca());
				veiculoLista.setModelo(veiculo.getModelo());
				veiculos.set(i, veiculoLista);
				return veiculoLista;
			}
			
			return null;
		}
		return veiculo;
	}
	
}

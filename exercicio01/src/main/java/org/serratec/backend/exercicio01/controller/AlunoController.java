package org.serratec.backend.exercicio01.controller;


import java.util.ArrayList;
import java.util.List;

import org.serratec.backend.exercicio01.domain.Aluno;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	//@Value("${nomeCliente}")
	//private String nomeCliente;
	
	//@GetMapping("/cliente")
	//public String retornaCliente() {
	//	return nomeCliente;
	//}
	
	public static List<Aluno> alunos = new ArrayList<>();
	static {
		alunos.add(new Aluno(1l, "Gabriel", "21938739"));
		alunos.add(new Aluno(2l, "Pedro", "23974372"));
		alunos.add(new Aluno(3l, "Leandro", "221938739"));
		alunos.add(new Aluno(4l, "João", "2193875539"));
	}
	
	@GetMapping
	public List<Aluno> listaAlunos(){
		return alunos;
	}

	@GetMapping("/{matricula}")//o que faz? permite acessar o aluno apenas acessando o parâmetro da matrícula ^^
	public Aluno buscaAluno(@PathVariable Long matricula) {
		for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = alunos.get(i);
			if (aluno.getMatricula().equals(matricula)) {
				return aluno;
			}
		}
		return null;
	}
	
	@PostMapping
	public Aluno inserir(@RequestBody Aluno aluno) {
		alunos.add(aluno);
		return aluno;
	}
	
	@DeleteMapping("/{matricula}")
	public void apagar(@PathVariable Long matricula) {
		for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = alunos.get(i);
			if (aluno.getMatricula().equals(matricula)) {
				alunos.remove(i);
				return;
			}
		}
	}
	
	@PutMapping("/{matricula}")
	public Aluno atualizar(@PathVariable Long matricula, @RequestBody Aluno aluno) {
		for (int i = 0; i < alunos.size(); i++) {
			Aluno alunoLista = alunos.get(i);
			if (alunoLista.getMatricula().equals(matricula)) {
				alunoLista.setNome(aluno.getNome());
				alunoLista.setTelefone(aluno.getTelefone());
				alunos.set(i, alunoLista);
				return alunoLista;
			}
			
			return null;
		}
		return aluno;
	}
}

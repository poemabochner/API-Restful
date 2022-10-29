package br.org.serratec.olamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundo {

	
		@GetMapping("/ola")
		public String olaMundo() {
			return "Ola alunos do Serratec";
		}
}

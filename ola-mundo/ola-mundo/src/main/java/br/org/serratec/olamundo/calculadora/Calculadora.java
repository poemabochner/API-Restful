package br.org.serratec.olamundo.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class Calculadora {

	@GetMapping("/soma")
	
	public String soma(@RequestParam Integer a, @RequestParam Integer b) {
		return "resultado da soma é: " + (a + b);
	}
	
@GetMapping("/subtracao")
	
	public String subtracao(@RequestParam Integer a, @RequestParam Integer b) {
		return "resultado da subtração é: " + (a - b);
	}

@GetMapping("/multiplicacao")

public String multiplicacao(@RequestParam Integer a, @RequestParam Integer b) {
	return "resultado da multiplicação é: " + (a + b);
}

@GetMapping("/divisao")

public String divisao(@RequestParam Integer a, @RequestParam Integer b) {
	return "resultado da divisão é: " + (a / b);
}
}

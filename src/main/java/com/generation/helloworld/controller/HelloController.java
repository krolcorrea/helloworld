package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "<b>Hello World!</b>";
	}

	@GetMapping("/bsm")
	public String meuNome() {
		return "<b>Mentalidades:</b> Orientação ao futuro, Responsabilidade pessoal, Mentalidade de Crescimento, "
				+ "Persistência. <b>Competencias comportamentais</b>: Comunicação, Proatividade, Orientação ao detalhe,"
				+ " Trabalho em equipe";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Estudar e Aprender Spring e Banco de dados, aplica-los simultaneamente no projeto blog pessoal e no "
				+ "projeto integrador";
	}
}

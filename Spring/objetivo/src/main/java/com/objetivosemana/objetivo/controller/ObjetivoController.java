package com.objetivosemana.objetivo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoController {
	
	@GetMapping
	public String objetivo() {
		return "Meus objetivos de aprendizagem são a Comunicação e Mentalidade de Crescimento";
	}

}

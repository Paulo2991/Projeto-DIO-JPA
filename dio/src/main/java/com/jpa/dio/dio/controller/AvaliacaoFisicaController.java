package com.jpa.dio.dio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.dio.dio.model.AvaliacaoFisica;
import com.jpa.dio.dio.model.form.AvaliacaoFisicaForm;
import com.jpa.dio.dio.service.AvaliacaoFisicaService;

@RestController
@RequestMapping("/avaliacaofisica")
public class AvaliacaoFisicaController {

	@Autowired
	AvaliacaoFisicaService avaliacaoFisicaService;
	
	@PostMapping
	public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm avaliacaoFisicaForm) {
		return avaliacaoFisicaService.cadastrarAvaliacao(avaliacaoFisicaForm);
	}

}

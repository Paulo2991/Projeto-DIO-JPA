package com.jpa.dio.dio.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.dio.dio.model.Aluno;
import com.jpa.dio.dio.model.AvaliacaoFisica;
import com.jpa.dio.dio.model.form.AlunoForm;
import com.jpa.dio.dio.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

	@Autowired
	private AlunoService alunoService;
	
	@PostMapping
	public Aluno create(@Valid @RequestBody AlunoForm alunoForm) {
		return alunoService.create(alunoForm);
	}
	
	@GetMapping("/avaliacao/{id}")
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
		return alunoService.getAllAvaliacaoFisicaId(id);
	}
}

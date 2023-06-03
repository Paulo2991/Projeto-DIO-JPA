package com.jpa.dio.dio.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.dio.dio.model.Matricula;
import com.jpa.dio.dio.model.form.MatriculaForm;
import com.jpa.dio.dio.service.MatriculaService;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {

	@Autowired
	private MatriculaService matriculaService;
	
	@PostMapping
	public Matricula cadastrarMatricula(@Valid @RequestBody MatriculaForm matriculaForm) {
		return matriculaService.cadastrarMatricula(matriculaForm);
	}
	
	@GetMapping
	public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) 
	String bairro){
		return matriculaService.getAll(bairro);
	}
}

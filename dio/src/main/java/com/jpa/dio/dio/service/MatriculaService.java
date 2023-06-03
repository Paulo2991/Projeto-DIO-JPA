package com.jpa.dio.dio.service;

import java.util.List;

import com.jpa.dio.dio.model.Matricula;
import com.jpa.dio.dio.model.form.MatriculaForm;

public interface MatriculaService {

	Matricula cadastrarMatricula(MatriculaForm matriculaForm);
	Matricula get(Long id);
	List<Matricula> getAll(String bairro);
	void deleteMatricula(Long id);
}

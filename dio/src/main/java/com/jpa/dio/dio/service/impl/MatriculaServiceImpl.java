package com.jpa.dio.dio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.dio.dio.model.Aluno;
import com.jpa.dio.dio.model.Matricula;
import com.jpa.dio.dio.model.form.MatriculaForm;
import com.jpa.dio.dio.repository.AlunoRepository;
import com.jpa.dio.dio.repository.MatriculaRepository;
import com.jpa.dio.dio.service.MatriculaService;

@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;

	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public Matricula cadastrarMatricula(MatriculaForm matriculaForm) {
		Matricula matricula = new Matricula();
	    Aluno aluno = alunoRepository.findById(matriculaForm.getAlunoId()).get();
		matricula.setAluno(aluno);
		return matriculaRepository.save(matricula);
	}

	@Override
	public Matricula get(Long id) {
		return matriculaRepository.findById(id).get();
	}

	@Override
	public List<Matricula> getAll(String bairro) {

		if (bairro == null) {
			return matriculaRepository.findAll();
		} else {
			return matriculaRepository.findAlunosMatriculadosBairro(bairro);
		}

	}

	@Override
	public void deleteMatricula(Long id) {
	}

}

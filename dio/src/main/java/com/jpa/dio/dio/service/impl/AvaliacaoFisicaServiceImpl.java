package com.jpa.dio.dio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.dio.dio.model.Aluno;
import com.jpa.dio.dio.model.AvaliacaoFisica;
import com.jpa.dio.dio.model.form.AvaliacaoFisicaForm;
import com.jpa.dio.dio.repository.AlunoRepository;
import com.jpa.dio.dio.repository.AvaliacaoFisicaRepository;
import com.jpa.dio.dio.service.AvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements AvaliacaoFisicaService{
	
	@Autowired
	private AvaliacaoFisicaRepository avaliacaoFisicaRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public AvaliacaoFisica cadastrarAvaliacao(AvaliacaoFisicaForm avaliacaoFisicaForm) {
		AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
		Aluno aluno = alunoRepository.findById(avaliacaoFisicaForm.getIdAluno()).get();
		avaliacaoFisica.setId(avaliacaoFisicaForm.getIdAvaliacaoFisica());
		avaliacaoFisica.setPeso(avaliacaoFisicaForm.getPeso());
		avaliacaoFisica.setAltura(avaliacaoFisicaForm.getAltura());
		avaliacaoFisica.setAluno(aluno);
		return avaliacaoFisicaRepository.save(avaliacaoFisica);
	}
}

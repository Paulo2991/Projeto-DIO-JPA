package com.jpa.dio.dio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.dio.dio.model.Aluno;
import com.jpa.dio.dio.model.AvaliacaoFisica;
import com.jpa.dio.dio.model.form.AlunoForm;
import com.jpa.dio.dio.model.form.AlunoUpdateForm;
import com.jpa.dio.dio.repository.AlunoRepository;
import com.jpa.dio.dio.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService {
	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public Aluno create(AlunoForm form) {
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setCpf(form.getCpf());
		aluno.setBairro(form.getBairro());
		aluno.setDataDeNascimento(form.getDataDeNascimento());

		return alunoRepository.save(aluno);
	}

	@Override
	public Aluno get(Long id) {
		return null;
	}

	@Override
	public Aluno update(Long id, AlunoUpdateForm formUpdate) {
		return null;
	}

	@Override
	public void delete(Long id) {
	}

	@Override
	public List<Aluno> getAll(String dataDeNascimento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
		Aluno aluno = alunoRepository.findById(id).get();
		return aluno.getAvaliacao();
	}
}

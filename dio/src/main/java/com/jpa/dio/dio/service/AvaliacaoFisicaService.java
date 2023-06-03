package com.jpa.dio.dio.service;

import com.jpa.dio.dio.model.AvaliacaoFisica;
import com.jpa.dio.dio.model.form.AvaliacaoFisicaForm;

public interface AvaliacaoFisicaService {
	AvaliacaoFisica cadastrarAvaliacao(AvaliacaoFisicaForm avaliacaoFisicaForm);
}

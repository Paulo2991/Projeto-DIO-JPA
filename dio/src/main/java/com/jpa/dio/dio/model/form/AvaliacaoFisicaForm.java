package com.jpa.dio.dio.model.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

	private Long idAvaliacaoFisica;
	private float peso;
	private float altura;
	private Long idAluno;
}

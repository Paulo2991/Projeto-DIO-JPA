package com.jpa.dio.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.dio.dio.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Long>{

	
}

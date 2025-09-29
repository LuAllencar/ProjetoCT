package br.com.projetoct.cursotecnico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoct.cursotecnico.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
    
}

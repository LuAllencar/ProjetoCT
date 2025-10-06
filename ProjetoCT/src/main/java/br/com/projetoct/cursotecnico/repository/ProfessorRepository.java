package br.com.projetoct.cursotecnico.repository;

import br.com.projetoct.cursotecnico.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}

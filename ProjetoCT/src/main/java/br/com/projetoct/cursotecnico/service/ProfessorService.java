package br.com.projetoct.cursotecnico.service;

import br.com.projetoct.cursotecnico.entity.Professor;
import br.com.projetoct.cursotecnico.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public List<Professor> findAll() {
        return professorRepository.findAll();
    }

    public Professor findById(Integer id) {
        return professorRepository.findById(id).orElse(null);
    }

    public Professor save(Professor professor) {
        return professorRepository.save(professor);
    }

    public void deleteById(Integer id) {
        professorRepository.deleteById(id);
    }
}

package br.com.projetoct.cursotecnico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoct.cursotecnico.entity.Professor;
import br.com.projetoct.cursotecnico.repository.ProfessorRepository;

@Service
public class ProfessorService {
    
@Autowired
private ProfessorRepository professorRepository;

public Professor save(Professor professor){
    return professorRepository.save(professor);
}

public List<Professor> findall() {
    return professorRepository.findAll();
}

public void deleteById(Integer Id){
    professorRepository.deleteById(Id);
}

public Professor findById(Integer Id){
    return professorRepository.findById(Id).orElse(null);
}

}

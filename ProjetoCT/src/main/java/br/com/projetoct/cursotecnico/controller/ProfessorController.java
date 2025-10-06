package br.com.projetoct.cursotecnico.controller;

import br.com.projetoct.cursotecnico.entity.Professor;
import br.com.projetoct.cursotecnico.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/professores")
@RequiredArgsConstructor
public class ProfessorController {

    private final ProfessorService professorService;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Professor> professores = professorService.findAll();
        model.addAttribute("professores", professores);
        return "professor/listarProfessor";
    }

    @GetMapping("/criar")
    public String criar(Model model) {
        model.addAttribute("professor", new Professor());
        return "professor/formularioProfessor";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("professor") Professor professor, BindingResult result) {
        if (result.hasErrors()) {
            return "professor/formularioProfessor";
        }
        professorService.save(professor);
        return "redirect:/professores/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Professor professor = professorService.findById(id);
        if (professor == null) {
            return "redirect:/professores/listar";
        }
        model.addAttribute("professor", professor);
        return "professor/formularioProfessor";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        professorService.deleteById(id);
        return "redirect:/professores/listar";
    }

    @GetMapping("/visualizar/{id}")
    public String visualizar(@PathVariable Integer id, Model model) {
        Professor professor = professorService.findById(id);
        if (professor == null) {
            return "redirect:/professores/listar";
        }
        model.addAttribute("professor", professor);
        return "professor/visualizarProfessor";
    }
}

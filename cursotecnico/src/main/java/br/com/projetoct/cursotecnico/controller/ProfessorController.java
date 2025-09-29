package br.com.projetoct.cursotecnico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import br.com.projetoct.cursotecnico.entity.Professor;
import br.com.projetoct.cursotecnico.service.ProfessorService;

@Controller
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    // Método para salvar professor com validação
    @PostMapping("/salvar")
    public String salvar(@Validated @ModelAttribute Professor professor, BindingResult result) {
        if (result.hasErrors()) {
            return "professor/formularioProfessor";
        }
        professorService.save(professor);
        return "redirect:/professores/listar";
    }

    // Método para listar todos os professores
    @GetMapping("/listar")
    public String listar(Model model) {
        List<Professor> professores = professorService.findall();
        model.addAttribute("professores", professores);
        return "professor/listarProfessor";
    }

    // Método para abrir o formulário de criação de professor
    @GetMapping("/criar")
    public String criarForm(Model model) {
        System.out.println("Abrindo formulário de criação de professor");
        model.addAttribute("professor", new Professor());
        return "professor/formularioProfessor";
    }

    // Método para excluir um professor
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Integer id) {
        professorService.deleteById(id);
        return "redirect:/professores/listar";
    }

    // Método para abrir o formulário de edição de professor
    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable("id") Integer id, Model model) {
        Professor professor = professorService.findById(id);
        if (professor == null) {
            return "redirect:/professores/listar";
        }
        model.addAttribute("professor", professor);
        return "professor/formularioProfessor";
    }

    // Método para visualizar os detalhes de um professor
    @GetMapping("/visualizar/{id}")
    public String visualizar(@PathVariable("id") Integer id, Model model) {
        Professor professor = professorService.findById(id);
        if (professor == null) {
            return "redirect:/professores/listar";
        }
        model.addAttribute("professor", professor);
        return "professor/visualizarProfessor";
    }
}
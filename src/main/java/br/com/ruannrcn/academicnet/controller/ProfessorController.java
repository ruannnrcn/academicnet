package br.com.ruannrcn.academicnet.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.ruannrcn.academicnet.modelo.Professor;
import br.com.ruannrcn.academicnet.repository.ProfessorRepository;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;


    @GetMapping("/{matricula}")
    public Optional<Professor> listarProfessorOptional(@PathVariable String matricula) {
        return professorRepository.findById(matricula);
    }
    

    @GetMapping
    public List<Professor> listAllProfessor() {
      return professorRepository.findAll();
    }

    @PostMapping
    public void adicionarProfessor(@RequestBody Professor professor) {
        professorRepository.save(professor);
    }

    @PutMapping
    public void alterarProfessor(@RequestBody Professor professor) {
      professorRepository.save(professor);
    }
    
    @DeleteMapping("/{matricula}")
    public void deletarProfessor(@PathVariable String matricula) {
      professorRepository.deleteById(matricula);  
    }


}

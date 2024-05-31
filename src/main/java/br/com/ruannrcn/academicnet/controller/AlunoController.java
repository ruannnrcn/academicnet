package br.com.ruannrcn.academicnet.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import br.com.ruannrcn.academicnet.modelo.Aluno;
import br.com.ruannrcn.academicnet.repository.AlunoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/alunos")
public class AlunoController {


    @Autowired
    private AlunoRepository alunoRepository;

    

    @GetMapping
    public List<Aluno> listAllAlunos () {
      return alunoRepository.findAll();
    }

    @GetMapping("/{matricula}")
    public Optional<Aluno> listarAluno(@PathVariable String matricula ) {
       return alunoRepository.findById(matricula);
      
    }
    
    @PostMapping
    public void adicionarAluno(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);
    }

    @PutMapping
    public void alterarAluno(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);

    }

    @DeleteMapping("/{matricula}")
    public void deletarAluno(@PathVariable String matricula) {
      alunoRepository.deleteById(matricula);
    }
    

}

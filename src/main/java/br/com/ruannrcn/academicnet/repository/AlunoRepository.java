package br.com.ruannrcn.academicnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ruannrcn.academicnet.modelo.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, String> {

}

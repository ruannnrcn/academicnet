package br.com.ruannrcn.academicnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ruannrcn.academicnet.modelo.Professor;

public interface ProfessorRepository extends JpaRepository <Professor, String> {

}

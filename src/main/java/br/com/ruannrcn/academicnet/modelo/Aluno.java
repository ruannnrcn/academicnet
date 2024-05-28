package br.com.ruannrcn.academicnet.modelo;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Aluno {

  @Id
  private String matricula;
  private String nome;
  private String telefone;
  private String email;
  private Instant dataCadastro; 

}

package com.luizotavio.academia.entity;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.LocalDate;
@Entity @Table(name="alunos") public class Aluno {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String nome; @NotBlank @Email @Column(unique=true) private String email; @NotBlank private String telefone; @NotNull private LocalDate dataNascimento;
 public Aluno(){} public Long getId(){return id;} public void setId(Long id){this.id=id;} public String getNome(){return nome;} public void setNome(String nome){this.nome=nome;} public String getEmail(){return email;} public void setEmail(String email){this.email=email;} public String getTelefone(){return telefone;} public void setTelefone(String telefone){this.telefone=telefone;} public LocalDate getDataNascimento(){return dataNascimento;} public void setDataNascimento(LocalDate v){this.dataNascimento=v;}
}

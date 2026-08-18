package com.luizotavio.academia.entity;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.LocalDateTime;
@Entity @Table(name="avaliacoes_fisicas") public class AvaliacaoFisica {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) @JoinColumn(name="aluno_id") private Aluno aluno; @Positive private double peso; @Positive private double altura; private LocalDateTime dataAvaliacao=LocalDateTime.now();
 public AvaliacaoFisica(){} public Long getId(){return id;} public void setId(Long id){this.id=id;} public Aluno getAluno(){return aluno;} public void setAluno(Aluno a){aluno=a;} public double getPeso(){return peso;} public void setPeso(double p){peso=p;} public double getAltura(){return altura;} public void setAltura(double a){altura=a;} public LocalDateTime getDataAvaliacao(){return dataAvaliacao;} public void setDataAvaliacao(LocalDateTime d){dataAvaliacao=d;}
}

package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso cursoJava = new Curso();

        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao(
                "Aprendendo Java e Programação Orientada a Objetos"
        );
        cursoJava.setCargaHoraria(8);


        Curso cursoSpring = new Curso();

        cursoSpring.setTitulo("Curso Spring Boot");
        cursoSpring.setDescricao(
                "Introdução ao desenvolvimento com Spring Boot"
        );
        cursoSpring.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo(
                "Mentoria de Java"
        );

        mentoria.setDescricao(
                "Mentoria sobre desenvolvimento Java"
        );

        mentoria.setData(
                LocalDate.now().plusDays(1)
        );


        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome(
                "Bootcamp Java Developer"
        );

        bootcamp.setDescricao(
                "Bootcamp completo de Java"
        );

        bootcamp.getConteudos().add(
                cursoJava
        );

        bootcamp.getConteudos().add(
                cursoSpring
        );

        bootcamp.getConteudos().add(
                mentoria
        );


        Dev luiz = new Dev();

        luiz.setNome(
                "Luiz Otavio"
        );

        luiz.inscreverBootcamp(
                bootcamp
        );


        System.out.println(
                "Conteúdos inscritos de "
                        + luiz.getNome()
                        + ":"
        );

        System.out.println(
                luiz.getConteudosInscritos()
        );


        luiz.progredir();
        luiz.progredir();


        System.out.println(
                "\nConteúdos inscritos:"
        );

        System.out.println(
                luiz.getConteudosInscritos()
        );


        System.out.println(
                "\nConteúdos concluídos:"
        );

        System.out.println(
                luiz.getConteudosConcluidos()
        );


        System.out.println(
                "\nXP total: "
                        + luiz.calcularTotalXp()
        );
    }
}
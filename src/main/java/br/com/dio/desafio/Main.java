package br.com.dio.desafio;

import br.com.dio.desafio.model.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {



        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Aprendendo Java na Aprendendo");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("c++");
        curso2.setDescricao("Aprendendo  C++ na  Aprendendo");
        curso2.setCargaHoraria(10);

        Mentorias mentorias = new Mentorias();
        mentorias.setTitulo("Mentoria de Java");
        mentorias.setDescricao("Descrição da Mentoria de Java");
        mentorias.setData(LocalDateTime.now());

//        System.out.println(curso2);
//        System.out.println(curso1);
//        System.out.println(mentorias);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricacao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentorias);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos:" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("conteúdos inscritos:" + devGabriel.getConteudosInscritos());
        System.out.println("conteúdos Concluidos:" + devGabriel.getConteudosConcluidos());
        System.out.println("XP:" + devGabriel.calcularTotalXp());

        System.out.println("-------");

        Dev devTalita = new Dev();
        devTalita.setNome("Talita");
        devTalita.inscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos:" + devTalita.getConteudosInscritos());
        devTalita.progredir();
        devTalita.progredir();
        devTalita.progredir();
        System.out.println("-");
        System.out.println("conteúdos inscritos:" + devTalita.getConteudosInscritos());
        System.out.println("conteúdos Concluidos:" + devTalita.getConteudosConcluidos());
        System.out.println("XP:" + devTalita.calcularTotalXp());




    }
}
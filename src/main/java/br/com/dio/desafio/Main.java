package br.com.dio.desafio;

import br.com.dio.desafio.model.*;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {



        Curso curso1 = new Curso("Java", "Aprendendo Java na Dio", 8);
        Curso curso2 = new Curso("C++", "Aprendendo C++ na Dio", 10);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição da Mentoria de Java", LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.adicionarConteudo(curso1);
        bootcamp.adicionarConteudo(curso2);
        bootcamp.adicionarConteudo(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Gabriel: " + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Gabriel: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Gabriel: " + devGabriel.getConteudosConcluidos());
        System.out.println("XP Gabriel: " + devGabriel.calcularTotalXp());
        System.out.println("Progresso Gabriel: " + devGabriel.calcularProgresso() + "%");

        System.out.println("-------");

        Dev devTalita = new Dev();
        devTalita.setNome("Talita");
        devTalita.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Talita: " + devTalita.getConteudosInscritos());
        devTalita.progredir();
        devTalita.progredir();
        devTalita.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Talita: " + devTalita.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Talita: " + devTalita.getConteudosConcluidos());
        System.out.println("XP Talita: " + devTalita.calcularTotalXp());
        System.out.println("Progresso Talita: " + devTalita.calcularProgresso() + "%");

        System.out.println("-------");

        List<Dev> ranking = bootcamp.getDevsInscritos().stream()
                .sorted(Comparator.comparing(Dev::calcularTotalXp).reversed())
                .collect(Collectors.toList());

        System.out.println("Ranking dos Devs:");
        ranking.forEach(dev ->
                System.out.println(dev.getNome() + ": " + dev.calcularTotalXp() + " XP")
        );
    }
}
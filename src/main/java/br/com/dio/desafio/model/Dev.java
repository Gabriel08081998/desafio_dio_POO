package br.com.dio.desafio.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;


@Data
@EqualsAndHashCode
public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        conteudo.ifPresentOrElse(c -> {
            this.conteudosConcluidos.add(c);
            this.conteudosInscritos.remove(c);
        }, () -> System.out.println("Você não está matriculado em nenhum conteúdo"));
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public double calcularProgresso() {
        int totalConteudos = conteudosInscritos.size() + conteudosConcluidos.size();
        return (totalConteudos == 0) ? 0 : (double) conteudosConcluidos.size() / totalConteudos * 100;
    }
}


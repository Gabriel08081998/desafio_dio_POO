package br.com.dio.desafio.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
@Data
@EqualsAndHashCode
public class Bootcamp {
    private  String nome;
    private  String descricacao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();

    private Set<ConteudoResponseDTO> conteudos = new LinkedHashSet<>();
}

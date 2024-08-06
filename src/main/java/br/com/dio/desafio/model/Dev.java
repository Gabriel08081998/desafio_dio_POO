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
    private Set<ConteudoResponseDTO> conteudosInscritos = new LinkedHashSet<>();
    private Set<ConteudoResponseDTO> conteudosConcluidos = new LinkedHashSet<>();

    public  void inscreverBootcamp(Bootcamp bootcamp){

        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir(){
        Optional<ConteudoResponseDTO> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else {
            System.out.println("Você não esta matriculado em nenhum conteudo");
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum();
    }


    }


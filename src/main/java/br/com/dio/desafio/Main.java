package br.com.dio.desafio;

import br.com.dio.desafio.model.Curso;
import br.com.dio.desafio.model.Mentorias;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição do Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("c++");
        curso1.setDescricao("Descrição do C++");
        curso1.setCargaHoraria(8);

        Mentorias mentorias = new Mentorias();
        mentorias.setTitulo("Mentoria de Java");
        mentorias.setDescricao("Descrição da Mentoria de Java");
        mentorias.setData(LocalDateTime.now());


        System.out.println(curso2);
        System.out.println(curso1);
        System.out.println(mentorias);

    }
}
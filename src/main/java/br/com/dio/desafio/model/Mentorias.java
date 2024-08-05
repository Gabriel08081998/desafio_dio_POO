package br.com.dio.desafio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mentorias {
    private String titulo;
    private String descricao;
    private LocalDateTime data;
}

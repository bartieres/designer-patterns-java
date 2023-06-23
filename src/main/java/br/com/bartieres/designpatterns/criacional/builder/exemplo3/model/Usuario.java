package br.com.bartieres.designpatterns.criacional.builder.exemplo3.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class Usuario {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    @Override
    public String toString() {
        return "Usuario{"
                + "nome='" + nome + '\''
                + ", sobrenome='" + sobrenome + '\''
                + ", dataNascimento=" + dataNascimento
                + '}';
    }
}

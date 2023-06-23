package br.com.bartieres.designpatterns.criacional.builder.exemplo4.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Usuario {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    public Usuario(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Usuario{"
                + "nome='" + nome + '\''
                + ", sobrenome='" + sobrenome + '\''
                + ", dataNascimento=" + dataNascimento
                + '}';
    }
}

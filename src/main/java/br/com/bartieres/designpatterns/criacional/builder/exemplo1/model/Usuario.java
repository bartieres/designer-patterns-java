package br.com.bartieres.designpatterns.criacional.builder.exemplo1.model;

import java.time.LocalDate;

public class Usuario {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    public Usuario() {}

    public static Usuario builder() {
        return new Usuario();
    }

    public Usuario nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Usuario sobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    public Usuario dataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
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

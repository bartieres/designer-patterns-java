package br.com.bartieres.designpatterns.creational.builder.exemple2.model;

import java.time.LocalDate;

public class UsuarioBuilder {

    private Usuario usuario;

    private UsuarioBuilder() {
        usuario = new Usuario();
    }

    public static UsuarioBuilder builder() {
        return new UsuarioBuilder();
    }

    public UsuarioBuilder nome(String nome) {
        usuario.setNome(nome);
        return this;
    }

    public UsuarioBuilder sobrenome(String sobrenome) {
        usuario.setSobrenome(sobrenome);
        return this;
    }

    public UsuarioBuilder dataNascimento(LocalDate dataNascimento) {
        usuario.setDataNascimento(dataNascimento);
        return this;
    }

    public Usuario build() {
        return usuario;
    }
}

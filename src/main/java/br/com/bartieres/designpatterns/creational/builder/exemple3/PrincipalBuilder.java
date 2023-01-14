package br.com.bartieres.designpatterns.creational.builder.exemple3;

import br.com.bartieres.designpatterns.creational.builder.exemple3.model.Usuario;

import java.time.LocalDate;

public class PrincipalBuilder {

    public static void main(String[] args) {

        Usuario usuario = Usuario.builder()
                .nome("Usuario")
                .sobrenome("Builder Exemplo")
                .dataNascimento(LocalDate.of(1990, 3, 15))
                .build();

        System.out.println(usuario.toString());
    }
}

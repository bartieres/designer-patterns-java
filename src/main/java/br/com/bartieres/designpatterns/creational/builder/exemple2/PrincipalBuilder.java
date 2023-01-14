package br.com.bartieres.designpatterns.creational.builder.exemple2;

import br.com.bartieres.designpatterns.creational.builder.exemple2.model.Usuario;
import br.com.bartieres.designpatterns.creational.builder.exemple2.model.UsuarioBuilder;

import java.time.LocalDate;

public class PrincipalBuilder {

    public static void main(String[] args) {

        Usuario usuario = UsuarioBuilder.builder()
                .nome("Usuario")
                .sobrenome("Builder Exemplo")
                .dataNascimento(LocalDate.of(1990, 3, 15))
                .build();

        System.out.println(usuario.toString());
    }
}

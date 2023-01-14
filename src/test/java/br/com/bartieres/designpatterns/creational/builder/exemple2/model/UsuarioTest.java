package br.com.bartieres.designpatterns.creational.builder.exemple2.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {

    @Test
    public void builder_deveRetornarNomeESobrenome() {

        Usuario usuario = UsuarioBuilder.builder()
                .nome("Usuario")
                .sobrenome("Builder Exemplo")
                .build();

        Assertions.assertThat(usuario.toString())
                .isEqualTo("Usuario{"
                        + "nome='Usuario', "
                        + "sobrenome='Builder Exemplo', "
                        + "dataNascimento=null}");
    }

    @Test
    public void builder_deveRetornarNomeESobrenomeEDataNascimento() {

        Usuario usuario = UsuarioBuilder.builder()
                .nome("Usuario")
                .sobrenome("Builder Exemplo")
                .dataNascimento(LocalDate.of(1990, 3, 15))
                .build();

        Assertions.assertThat(usuario.toString())
                .isEqualTo("Usuario{"
                        + "nome='Usuario', "
                        + "sobrenome='Builder Exemplo', "
                        + "dataNascimento=1990-03-15}");
    }
}

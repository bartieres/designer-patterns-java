package br.com.bartieres.designpatterns.creational.builder.exemple1.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {

    @Test
    public void builder_deveRetornarNomeESobrenome() {

        Usuario usuario = Usuario.builder()
                .nome("Usuario")
                .sobrenome("Builder Exemplo");

        Assertions.assertThat(usuario.toString())
                .isEqualTo("Usuario{"
                        + "nome='Usuario', "
                        + "sobrenome='Builder Exemplo', "
                        + "dataNascimento=null}");
    }

    @Test
    public void builder_deveRetornarNomeESobrenomeEDataNascimento() {

        Usuario usuario = Usuario.builder()
                .nome("Usuario")
                .sobrenome("Builder Exemplo")
                .dataNascimento(LocalDate.of(1990, 3, 15));

        Assertions.assertThat(usuario.toString())
                .isEqualTo("Usuario{"
                        + "nome='Usuario', "
                        + "sobrenome='Builder Exemplo', "
                        + "dataNascimento=1990-03-15}");
    }
}

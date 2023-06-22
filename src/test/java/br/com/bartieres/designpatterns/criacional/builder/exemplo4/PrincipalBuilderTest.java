package br.com.bartieres.designpatterns.criacional.builder.exemplo4;

import br.com.bartieres.designpatterns.criacional.builder.exemplo4.model.Usuario;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrincipalBuilderTest {

    @Test
    public void builder() {

        Usuario usuario = new PrincipalBuilder().builder();

        Assertions.assertThat(usuario.toString())
                .isEqualTo("Usuario{"
                        + "nome='Usuario', "
                        + "sobrenome='Builder Exemplo', "
                        + "dataNascimento=1990-03-15}");
    }
}

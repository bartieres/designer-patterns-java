package br.com.bartieres.designpatterns.criacional.singleton;

import br.com.bartieres.designpatterns.criacional.singleton.model.Usuario;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrincipalSingletonTest {

    private static int id = 0;

    @BeforeEach
    public void setup() {
        id = new PrincipalSingleton().singleton().getId();
    }

    @Test
    public void singleton_teste1IdRandom() {

        Usuario usuario = new PrincipalSingleton().singleton();

        Assertions.assertThat(usuario.toString())
                .isEqualTo("Usuario{"
                        + "id=" + id + ", "
                        + "nome='Usuario', "
                        + "sobrenome='Builder Exemplo', "
                        + "dataNascimento=1990-03-15}");
    }

    @Test
    public void singleton_teste2IdRandom() {

        Usuario usuario = new PrincipalSingleton().singleton();

        Assertions.assertThat(usuario.toString())
                .isEqualTo("Usuario{"
                        + "id=" + id + ", "
                        + "nome='Usuario', "
                        + "sobrenome='Builder Exemplo', "
                        + "dataNascimento=1990-03-15}");
    }
}

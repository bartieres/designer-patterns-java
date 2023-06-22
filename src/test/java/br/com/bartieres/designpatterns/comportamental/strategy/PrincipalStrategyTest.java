package br.com.bartieres.designpatterns.comportamental.strategy;

import br.com.bartieres.designpatterns.comportamental.strategy.model.Usuario;
import br.com.bartieres.designpatterns.comportamental.strategy.validators.PessoaFisicaValidador;
import br.com.bartieres.designpatterns.comportamental.strategy.validators.PessoaJuridicaValidador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrincipalStrategyTest {

    @Test
    public void strategy_cpfValido() {

        Usuario usuario = new Usuario("12365478901");
        new PrincipalStrategy().strategy(usuario, new PessoaFisicaValidador());
    }

    @Test
    public void strategy_cpfInvalido() {

        Usuario usuario = new Usuario("1236547");

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> new PrincipalStrategy().strategy(usuario, new PessoaFisicaValidador()));

        String expectedMessage = "CPF inválido.";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void strategy_cnpjValido() {

        Usuario usuario = new Usuario("12365478901236");
        new PrincipalStrategy().strategy(usuario, new PessoaJuridicaValidador());
    }

    @Test
    public void strategy_cnpjInvalido() {

        Usuario usuario = new Usuario("123654789012");

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> new PrincipalStrategy().strategy(usuario, new PessoaJuridicaValidador()));

        String expectedMessage = "CNPJ inválido.";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}

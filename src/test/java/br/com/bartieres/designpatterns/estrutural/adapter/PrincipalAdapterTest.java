package br.com.bartieres.designpatterns.estrutural.adapter;

import br.com.bartieres.designpatterns.estrutural.adapter.model.PessoaFisica;
import br.com.bartieres.designpatterns.estrutural.adapter.model.PessoaJuridica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrincipalAdapterTest {

    @Test
    public void adapter_cpfInformado() {

        PessoaFisica pessoaFisica = new PessoaFisica("12365478901");
        new PrincipalAdapter().adapter(pessoaFisica);
    }

    @Test
    public void adapter_cpfNaoInformado() {

        PessoaFisica pessoaFisica = new PessoaFisica();

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> new PrincipalAdapter().adapter(pessoaFisica));

        String expectedMessage = "CPF/CNPJ não informado.";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void adapter_cnpjInformado() {

        PessoaJuridica pessoaJuridica = new PessoaJuridica("12365478901236");
        new PrincipalAdapter().adapter(pessoaJuridica);
    }

    @Test
    public void adapter_cnpjNaoInformado() {

        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> new PrincipalAdapter().adapter(pessoaJuridica));

        String expectedMessage = "CPF/CNPJ não informado.";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}

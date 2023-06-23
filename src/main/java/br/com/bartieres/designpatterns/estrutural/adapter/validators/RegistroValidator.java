package br.com.bartieres.designpatterns.estrutural.adapter.validators;

import br.com.bartieres.designpatterns.estrutural.adapter.model.IPessoaAdapter;

import java.util.Objects;

public class RegistroValidator {

    public void validate(IPessoaAdapter pessoaAdapter) {
        if (Objects.isNull(pessoaAdapter.getRegistro())) {
            throw new IllegalArgumentException("CPF/CNPJ não informado.");
        }
    }
}

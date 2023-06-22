package br.com.bartieres.designpatterns.comportamental.strategy.validators;

import br.com.bartieres.designpatterns.comportamental.strategy.model.Usuario;

public class PessoaFisicaValidador implements IValidador {

    @Override
    public void validate(Usuario usuario) {
        if (usuario.getCpfCnpj().length() != 11) {
            throw new IllegalArgumentException("CPF inválido.");
        }
    }
}

package br.com.bartieres.designpatterns.comportamental.strategy.validators;

import br.com.bartieres.designpatterns.comportamental.strategy.model.Usuario;

public class PessoaJuridicaValidador implements IValidador {

    @Override
    public void validate(Usuario usuario) {
        if (usuario.getCpfCnpj().length() != 14) {
            throw new IllegalArgumentException("CNPJ inválido.");
        }
    }
}

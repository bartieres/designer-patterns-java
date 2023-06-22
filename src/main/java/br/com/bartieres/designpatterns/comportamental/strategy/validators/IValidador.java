package br.com.bartieres.designpatterns.comportamental.strategy.validators;

import br.com.bartieres.designpatterns.comportamental.strategy.model.Usuario;

public interface IValidador {

    void validate(Usuario usuario);
}

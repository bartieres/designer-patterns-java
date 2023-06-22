package br.com.bartieres.designpatterns.comportamental.strategy;

import br.com.bartieres.designpatterns.comportamental.strategy.model.Usuario;
import br.com.bartieres.designpatterns.comportamental.strategy.validators.IValidador;

public class PrincipalStrategy {

    public void strategy(Usuario usuario, IValidador validador) {
        validador.validate(usuario);
    }
}

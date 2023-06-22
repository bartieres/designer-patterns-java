package br.com.bartieres.designpatterns.criacional.singleton;

import br.com.bartieres.designpatterns.criacional.singleton.model.Usuario;

public class PrincipalSingleton {

    public Usuario singleton() {
        return Usuario.getInstance();
    }
}

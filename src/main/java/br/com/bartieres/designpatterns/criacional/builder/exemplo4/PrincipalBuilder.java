package br.com.bartieres.designpatterns.criacional.builder.exemplo4;

import br.com.bartieres.designpatterns.criacional.builder.exemplo4.model.Usuario;

import java.time.LocalDate;

public class PrincipalBuilder {

    public Usuario builder() {
        return new Usuario("Usuario", "Builder Exemplo", LocalDate.of(1990, 3, 15));
    }
}

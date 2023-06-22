package br.com.bartieres.designpatterns.criacional.builder.exemplo3;

import br.com.bartieres.designpatterns.criacional.builder.exemplo3.model.Usuario;

import java.time.LocalDate;

public class PrincipalBuilder {

    public Usuario builder() {
        return Usuario.builder()
                .nome("Usuario")
                .sobrenome("Builder Exemplo")
                .dataNascimento(LocalDate.of(1990, 3, 15))
                .build();
    }
}

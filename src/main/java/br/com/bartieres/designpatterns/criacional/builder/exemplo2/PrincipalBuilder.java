package br.com.bartieres.designpatterns.criacional.builder.exemplo2;

import br.com.bartieres.designpatterns.criacional.builder.exemplo2.model.Usuario;
import br.com.bartieres.designpatterns.criacional.builder.exemplo2.model.UsuarioBuilder;

import java.time.LocalDate;

public class PrincipalBuilder {

    public Usuario builder() {
        return UsuarioBuilder.builder()
                .nome("Usuario")
                .sobrenome("Builder Exemplo")
                .dataNascimento(LocalDate.of(1990, 3, 15))
                .build();
    }
}

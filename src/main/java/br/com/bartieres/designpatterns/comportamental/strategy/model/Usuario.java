package br.com.bartieres.designpatterns.comportamental.strategy.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {

    private String cpfCnpj;

    public Usuario(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
}

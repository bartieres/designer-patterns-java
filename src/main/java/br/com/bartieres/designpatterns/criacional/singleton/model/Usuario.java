package br.com.bartieres.designpatterns.criacional.singleton.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

@Getter
@Setter
public class Usuario {

    private int id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    private static Usuario instance;

    public Usuario(int id, String nome, String sobrenome, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento =dataNascimento;
    }

    public static Usuario getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Usuario(
                    new Random().nextInt(30),
                    "Usuario",
                    "Builder Exemplo",
                    LocalDate.of(1990, 3, 15));
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id + ", " +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}

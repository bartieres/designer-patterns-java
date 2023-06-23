package br.com.bartieres.designpatterns.estrutural.decorator;

public class PrincipalDecorator {

    public Cozinha decorator() {
        CozinhaImpl cozinha = new CozinhaImpl();
        Cozinha fogao = new Fogao(cozinha);
        Cozinha mesa = new Mesa(fogao);
        Cozinha geladeira = new Geladeira(mesa);
        return new Microondas(geladeira);
    }
}

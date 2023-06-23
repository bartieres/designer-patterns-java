package br.com.bartieres.designpatterns.estrutural.decorator;

public class Fogao extends CozinhaDecorator {

    public Fogao(Cozinha cozinha) {
        super(cozinha);
    }

    @Override
    public String decorar() {
        return super.decorar() + " com Fogão";
    }
}

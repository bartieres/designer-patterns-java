package br.com.bartieres.designpatterns.estrutural.decorator;

public class Microondas extends CozinhaDecorator {

    public Microondas(Cozinha cozinha) {
        super(cozinha);
    }

    @Override
    public String decorar() {
        return super.decorar() + " com Microondas";
    }
}

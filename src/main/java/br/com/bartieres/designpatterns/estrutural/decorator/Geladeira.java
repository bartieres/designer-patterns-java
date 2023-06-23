package br.com.bartieres.designpatterns.estrutural.decorator;

public class Geladeira extends CozinhaDecorator {

    public Geladeira(Cozinha cozinha) {
        super(cozinha);
    }

    @Override
    public String decorar() {
        return super.decorar() + " com Geladeira";
    }
}

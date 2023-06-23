package br.com.bartieres.designpatterns.estrutural.decorator;

public class Mesa extends CozinhaDecorator {

    public Mesa(Cozinha cozinha) {
        super(cozinha);
    }

    @Override
    public String decorar() {
        return super.decorar() + " com Mesa";
    }
}

package br.com.bartieres.designpatterns.estrutural.decorator;

public abstract class CozinhaDecorator implements Cozinha {

    private Cozinha cozinha;

    public CozinhaDecorator(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    @Override
    public String decorar() {
        return cozinha.decorar();
    }
}

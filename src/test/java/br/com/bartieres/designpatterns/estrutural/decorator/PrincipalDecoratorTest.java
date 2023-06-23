package br.com.bartieres.designpatterns.estrutural.decorator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrincipalDecoratorTest {

    @Test
    public void decorator() {

        PrincipalDecorator decorator = new PrincipalDecorator();

        Assertions.assertThat(decorator.decorator().decorar())
                .isEqualTo("Cozinha com Fogão com Mesa com Geladeira com Microondas");
    }
}

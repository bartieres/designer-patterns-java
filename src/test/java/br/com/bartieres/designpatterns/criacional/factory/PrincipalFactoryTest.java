package br.com.bartieres.designpatterns.criacional.factory;

import br.com.bartieres.designpatterns.criacional.factory.enums.TipoConexao;
import br.com.bartieres.designpatterns.criacional.factory.model.Connection;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrincipalFactoryTest {

    @Test
    public void factory_testeConnectionOracle() {

        Connection connection = new PrincipalFactory().factory(TipoConexao.ORACLE);

        Assertions.assertThat(connection.toString())
                .isEqualTo("Connection{"
                        + "databaseName='Banco Oracle', "
                        + "url='url:localhost:oracle', "
                        + "user='root', "
                        + "password='1234'}");
    }

    @Test
    public void factory_testeConnectionMysql() {

        Connection connection = new PrincipalFactory().factory(TipoConexao.MYSQL);

        Assertions.assertThat(connection.toString())
                .isEqualTo("Connection{"
                        + "databaseName='Banco Mysql', "
                        + "url='url:localhost:mysql', "
                        + "user='root', "
                        + "password='1234'}");
    }

    @Test
    public void factory_testeConnectionPostgreSql() {

        Connection connection = new PrincipalFactory().factory(TipoConexao.POSTGRESQL);

        Assertions.assertThat(connection.toString())
                .isEqualTo("Connection{"
                        + "databaseName='Banco PostgreSql', "
                        + "url='url:localhost:postgresql', "
                        + "user='root', "
                        + "password='1234'}");
    }
}

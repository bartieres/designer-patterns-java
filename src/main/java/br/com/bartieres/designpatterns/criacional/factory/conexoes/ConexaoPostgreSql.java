package br.com.bartieres.designpatterns.criacional.factory.conexoes;

import br.com.bartieres.designpatterns.criacional.factory.model.Connection;

public class ConexaoPostgreSql implements IConexao {

    @Override
    public Connection getConnection() {
        Connection source = new Connection();
        source.setDatabaseName("Banco PostgreSql");
        source.setUrl("url:localhost:postgresql");
        source.setUser("root");
        source.setPassword("1234");
        return source;
    }
}

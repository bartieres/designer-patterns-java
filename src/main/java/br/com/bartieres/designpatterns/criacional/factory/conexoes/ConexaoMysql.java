package br.com.bartieres.designpatterns.criacional.factory.conexoes;

import br.com.bartieres.designpatterns.criacional.factory.model.Connection;

public class ConexaoMysql implements IConexao {

    @Override
    public Connection getConnection() {
        Connection source = new Connection();
        source.setDatabaseName("Banco Mysql");
        source.setUrl("url:localhost:mysql");
        source.setUser("root");
        source.setPassword("1234");
        return source;
    }
}

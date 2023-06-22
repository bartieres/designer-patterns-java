package br.com.bartieres.designpatterns.criacional.factory.conexoes;

import br.com.bartieres.designpatterns.criacional.factory.model.Connection;

public class ConexaoOracle implements IConexao {

    @Override
    public Connection getConnection() {
        Connection source = new Connection();
        source.setDatabaseName("Banco Oracle");
        source.setUrl("url:localhost:oracle");
        source.setUser("root");
        source.setPassword("1234");
        return source;
    }
}

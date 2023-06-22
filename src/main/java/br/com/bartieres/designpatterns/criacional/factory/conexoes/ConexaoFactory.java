package br.com.bartieres.designpatterns.criacional.factory.conexoes;

import br.com.bartieres.designpatterns.criacional.factory.enums.TipoConexao;
import br.com.bartieres.designpatterns.criacional.factory.model.Connection;

public class ConexaoFactory {

    private ConexaoFactory() {}

    public static IConexao getConexao(TipoConexao tipo) {
        switch (tipo) {
            case ORACLE:
                return new ConexaoOracle();
            case MYSQL:
                return new ConexaoMysql();
            case POSTGRESQL:
                return new ConexaoPostgreSql();
            default:
                throw new RuntimeException("Banco não existe");
        }
    }
}

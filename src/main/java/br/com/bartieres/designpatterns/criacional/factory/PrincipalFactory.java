package br.com.bartieres.designpatterns.criacional.factory;

import br.com.bartieres.designpatterns.criacional.factory.conexoes.ConexaoFactory;
import br.com.bartieres.designpatterns.criacional.factory.enums.TipoConexao;
import br.com.bartieres.designpatterns.criacional.factory.model.Connection;

public class PrincipalFactory {

    public Connection factory(TipoConexao tipoConexao) {
        return ConexaoFactory.getConexao(tipoConexao).getConnection();
    }
}

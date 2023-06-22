package br.com.bartieres.designpatterns.criacional.factory.conexoes;

import br.com.bartieres.designpatterns.criacional.factory.model.Connection;

public interface IConexao {

    Connection getConnection();
}

package br.com.bartieres.designpatterns.criacional.factory.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Connection {

    private String databaseName;
    private String url;
    private String user;
    private String password;

    @Override
    public String toString() {
        return "Connection{"
                + "databaseName='" + databaseName + '\''
                + ", url='" + url + '\''
                + ", user='" + user + '\''
                + ", password='" + password + '\''
                + '}';
    }
}

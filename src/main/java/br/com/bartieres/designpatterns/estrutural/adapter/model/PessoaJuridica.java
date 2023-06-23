package br.com.bartieres.designpatterns.estrutural.adapter.model;

public class PessoaJuridica implements IPessoaAdapter {

    private String cnpj;

    public PessoaJuridica() { }

    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getRegistro() {
        return cnpj;
    }
}

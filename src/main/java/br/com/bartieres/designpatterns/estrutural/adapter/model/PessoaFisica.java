package br.com.bartieres.designpatterns.estrutural.adapter.model;

public class PessoaFisica implements IPessoaAdapter {

    private String cpf;

    public PessoaFisica() { }

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getRegistro() {
        return cpf;
    }
}

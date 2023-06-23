package br.com.bartieres.designpatterns.estrutural.adapter;

import br.com.bartieres.designpatterns.estrutural.adapter.model.IPessoaAdapter;
import br.com.bartieres.designpatterns.estrutural.adapter.validators.RegistroValidator;

public class PrincipalAdapter {

    public void adapter(IPessoaAdapter pessoaAdapter) {
        RegistroValidator registroValidator = new RegistroValidator();
        registroValidator.validate(pessoaAdapter);
    }
}

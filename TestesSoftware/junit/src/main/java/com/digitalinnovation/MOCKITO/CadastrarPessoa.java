package com.digitalinnovation.MOCKITO;

import java.time.LocalDateTime;

import com.digitalinnovation.Pessoa;

public class CadastrarPessoa {
    
    private ApiDosCorreios apiDosCorreios;

    public Pessoa cadastraPessoa(String nome, String documento, LocalDateTime nascimento, String cep){
        Pessoa pessoa =  new Pessoa(nome, documento, null, nascimento);
        DadosDeLocalizacao dadosDeLocalizacao = apiDosCorreios.buscaDadosComBaseNoCep(cep);
        pessoa.adicionaDadosDeEndereco(dadosDeLocalizacao);
        return pessoa;
    }

}

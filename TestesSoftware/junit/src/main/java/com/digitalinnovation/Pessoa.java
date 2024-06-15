package com.digitalinnovation;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import com.digitalinnovation.MOCKITO.DadosDeLocalizacao;

public class Pessoa {
    
    private String nome;

    private String documento;

    private DadosDeLocalizacao endereco;

    private LocalDateTime nascimento;

    public Pessoa(String nome, String documento, DadosDeLocalizacao endereco, LocalDateTime nascimento) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.nascimento = nascimento;
    }

    public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public boolean ehMaiorDeIdade(){
        return getIdade() > 18;
    }

    
    public void adicionaDadosDeEndereco(DadosDeLocalizacao dadosLocalizacao) {
        this.endereco = dadosLocalizacao;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public DadosDeLocalizacao getEndereco() {
        return endereco;
    }

    public LocalDateTime getNascimento() {
        return nascimento;
    }
    

}

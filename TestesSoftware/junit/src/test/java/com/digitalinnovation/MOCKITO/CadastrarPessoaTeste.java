package com.digitalinnovation.MOCKITO;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.digitalinnovation.Pessoa;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {
    
    /*Um mock é um objeto simulado que imita o comportamento de um objeto real de uma maneira pré-programada. 
    Isso permite que você isole o código que está sendo testado, fornecendo respostas predefinidas para métodos
    chamados durante a execução dos testes. */

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks // injetando o mock em cadastrar pessoa para utilizacao do atributo apiDosCorreios mockado presente na classe
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){
        DadosDeLocalizacao dadosDeLocalizacao = new DadosDeLocalizacao("SP", "Sao Paulo", "Rua", "Apto 12345", "X");

        // Ao inves de buscar o CEP na API retorna o parametro passado
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("0000-0000")).thenReturn(dadosDeLocalizacao);

       Pessoa pessoa = cadastrarPessoa.cadastraPessoa("Murilo", "1111111111", 
        LocalDateTime.of(2003, 9, 17, 10, 0, 0), "0000-0000");

        Assertions.assertEquals("Murilo", pessoa.getNome());
        Assertions.assertEquals("SP", pessoa.getEndereco().getUf());
        Assertions.assertEquals("Sao Paulo", pessoa.getEndereco().getCidade());
        Assertions.assertEquals("X", pessoa.getEndereco().getBairro());
    

    }

}

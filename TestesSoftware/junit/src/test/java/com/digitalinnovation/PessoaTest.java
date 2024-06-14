package com.digitalinnovation;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PessoaTest {
    
    @Test // -> Anotacao eh primordial para testes
    void deveCalcularIdadeCorretamente(){
        Pessoa pessoa = new Pessoa("Mauro", LocalDateTime.of(2000, 1, 1, 14, 0, 0)); // Cria o cenario
        Assertions.assertEquals(24, pessoa.getIdade()); // Executa a validacao
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Mauro", LocalDateTime.of(2000, 1, 1, 14, 0, 0));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDateTime.of(2024, 1, 1, 14, 0, 0));
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}

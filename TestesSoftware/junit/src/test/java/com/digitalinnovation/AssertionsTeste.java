package com.digitalinnovation;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {
    
    @Test
    void validarLancamento(){

        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {10,20,30,40,50};

        // assert para verificar se arryas sao iguais
        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento); // resulltado esperado, atual
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        Pessoa henrique = new Pessoa("Henrique", LocalDateTime.now());
        Assertions.assertNotNull(henrique);
    }


    @Test
    void validarNumerosDeTiposDiferentes() {

        double valor = 5.0;
        int outroValor = 5;

        Assertions.assertEquals(valor, outroValor);

    }

}

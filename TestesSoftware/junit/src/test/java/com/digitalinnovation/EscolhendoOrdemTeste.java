package com.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*Ordenando os Testes */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

/* @TestMethodOrder(MethodOrderer.MethodName.class) --> ordena por ordem alfabetica */
/* @TestMethodOrder(MethodOrderer.Random.class) --> ordena aleatoriamente */

public class EscolhendoOrdemTeste {

    @Order(4) // notacao para selecionar a ordem do teste
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }

}

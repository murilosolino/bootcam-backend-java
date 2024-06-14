package com.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTeste {
    
    /*Validando se ocorre excecoes com assertThows */

    /*Validando se nao ocorre excessoes com assertDoesNotThrow*/

    @Test
    void validaCenarioDeExcecaoNaTransferencia(){
        Conta conta = new Conta("12345", 0);
        Conta contaDestino = new Conta("45678", 100);

        TransferenciaEntreContas contas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> 
        contas.transfere(conta, contaDestino, -1));

        Assertions.assertDoesNotThrow( () -> 
        contas.transfere(conta, contaDestino, 20));
    }

}

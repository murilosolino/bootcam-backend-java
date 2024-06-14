package com.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTeste {
    
    /*Os testes condicionais permitem que você controle a execução de testes ou métodos de teste com base em
     condições específicas, como a presença de uma classe no classpath, uma propriedade de sistema específica, 
     entre outros. */

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "root")
     void validarAlgoSomenteNoUsuario(){
        Assertions.assertEquals(10, 5+5);
    }

}

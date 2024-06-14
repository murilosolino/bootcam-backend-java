package com.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {
    
    /*As assunções são usadas para verificar se certas condições são verdadeiras antes de executar um teste. 
    Se a condição não for atendida, o teste é automaticamente ignorado.
    Isso é útil em situações onde você só deseja executar o teste sob certas condições, 
    como em um ambiente específico ou com configurações específicas. */

    @Test
    void validarAlgoSomenteNoUsuario(){
        Assumptions.assumeTrue("muril".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }

}

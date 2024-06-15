package com.digitalinnovation.MOCKITO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {
    
    @Mock
    private PlataformaDeEnvio palataforma;

    @InjectMocks
    private ServicoDeEmail servico;

    @Captor // captura argumentos de um metodo
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviadosParaAPlataforma(){
        String enderecoEmail = "usuario@teste.com.br";
        String msg = "Ola mundo";
        boolean ehHtml = false;

        servico.enviaEmail(enderecoEmail, msg, ehHtml);


        Mockito.verify(palataforma).enviaEmail(captor.capture());

        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(enderecoEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(msg, emailCapturado.getMensagem());

    }

}

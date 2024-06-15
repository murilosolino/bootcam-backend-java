package com.digitalinnovation.MOCKITO;

public class ServicoDeEmail {
    private PlataformaDeEnvio plataforma;

    public void enviaEmail(String enderecoEmail, String mensagem, boolean formatoHtml) {

        Email email = null;

        if(formatoHtml) {
            email = new Email(enderecoEmail, mensagem);
        }else{
            email = new Email(enderecoEmail, mensagem);
        }

        plataforma.enviaEmail(email);
    }
}

package com.digitalinnovation;

public class TransferenciaEntreContas {

    public void transfere(Conta origem, Conta destino, double valor) throws Exception{
        if (valor <= 0){
          throw new  IllegalArgumentException("Valor deve ser maior que 0");
        }
    }

}

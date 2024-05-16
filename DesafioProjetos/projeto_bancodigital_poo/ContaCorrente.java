package DesafioProjetos.projeto_bancodigital_poo;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, long numero, double saldo, Cliente cliente) {
        super(agencia, numero, saldo, cliente);
        
    }
    
    @Override
    public void imprimrExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimrExtrato();
    }

}

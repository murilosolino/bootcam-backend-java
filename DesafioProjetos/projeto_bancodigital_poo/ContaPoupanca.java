package DesafioProjetos.projeto_bancodigital_poo;

public class ContaPoupanca extends Conta {
    
    private double taxaRendimentoMensal;

    public ContaPoupanca(int agencia, long numero, double saldo, Cliente cliente) {
        super(agencia, numero, saldo, cliente);
        this.taxaRendimentoMensal = 0.005;
        
    }

    @Override
    public void imprimrExtrato() {
        System.out.println("==== Extrato Conta Poupança ====");
        super.imprimrExtrato();
    }

    public void calculaRendimentoMensal(int qtdMeses){

        double saldoAtual = super.getSaldo();
        double rendimentoMensal = 0;

        for(int i = 1; i <= qtdMeses; i++){
            rendimentoMensal += saldoAtual * this.taxaRendimentoMensal;
        }

        double saldoAposRendimento = saldoAtual + rendimentoMensal;

        System.out.println("Seu saldo após " + qtdMeses + " meses de rendimento será de: " + saldoAposRendimento);

    }


}

package DesafioProjetos.projeto_bancodigital_poo;

public abstract class Conta {

    protected static long SEQUENCIAL = 1;
    protected int agencia;
    protected long numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(int agencia, long numero, double saldo, Cliente cliente) {
        this.agencia = 001;
        this.numero = SEQUENCIAL++;
        this.saldo = saldo;
        this.cliente = cliente; 
    }

    public String getCliente() {
        return cliente.toString();
    }

    public int getAgencia() {
        return agencia;
    }

    public long getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para sacar o valor de R$ " + valor);
        }
        this.saldo -= valor;
    }

    public void transferir(double valor, Conta contaDestino) {

        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar transferencia no valor de R$ " + valor);
        }

        this.saldo -= valor;
        contaDestino.depositar(valor);
    }

    protected void imprimrExtrato(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero da Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "]";
    }

    

}

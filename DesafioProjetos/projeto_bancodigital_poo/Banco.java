package DesafioProjetos.projeto_bancodigital_poo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String nome;
    private List<Conta> listaContas;

    public Banco(String nome) {
        this.nome = nome;
        this.listaContas = new ArrayList<Conta>();
    }

    public String getNome() {
        return nome;
    }
    public Cliente cadastroCliente(String nome, String cpf, String endereco, String telefone, String email){
        Cliente cliente = new Cliente(nome, cpf, endereco, telefone, email);
        return cliente;
    }


    public ContaCorrente abrirContaCorrente(Cliente cliente){
        ContaCorrente conta = new ContaCorrente(001, 0, 0, cliente);
        listaContas.add(conta);
        return conta;
    }

    public ContaPoupanca abrirContaPoupanca(Cliente cliente){
        ContaPoupanca conta = new ContaPoupanca(001, 0, 0, cliente);
        listaContas.add(conta);
        return conta;
    }
    
    public void fecharConta(int  numeroConta){     
        for (Conta c : listaContas) {
            if (c.getNumero() == numeroConta) {
                listaContas.remove(c);
                break;
            }
        }
        
    }

    public void listarContasContas(){
        for (Conta c : listaContas) {
            System.out.println(c.toString());
        }
    }

    public void listarClientes(){
        for (Conta c : listaContas) {
            System.out.println(c.getCliente());
        }
    }

    public Conta buscarConta(int numeroContaOperacao) {
        Conta contaEncontrada = null;
        for (Conta conta : listaContas) {
            
            if (numeroContaOperacao == conta.getNumero()) {
                contaEncontrada = conta;
                break;
            }

        }
        return contaEncontrada;
    }

    public boolean verificarListaContaVazia(){

        if (listaContas.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}

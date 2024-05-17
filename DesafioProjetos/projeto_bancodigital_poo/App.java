package DesafioProjetos.projeto_bancodigital_poo;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        Banco banco = new Banco("Meu Banco");
        Scanner scanner = new Scanner(System.in);
        int opcao;
        List<Cliente> clientes = new ArrayList<Cliente>();

        do {

            exibeSelecaoMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
                    String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente:");
                    String endereco = JOptionPane.showInputDialog("Digite o endereço do cliente:");
                    String telefone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
                    String email = JOptionPane.showInputDialog("Digite o email do cliente:");

                    Cliente cliente = banco.cadastroCliente(nome, cpf, endereco, telefone, email);
                    clientes.add(cliente);

                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    // Código para abrir conta corrente
                    try {
                        if (clientes.isEmpty()) {
                            throw new NoSuchElementException("");
                        }
                        String cpfBuscado = JOptionPane
                                .showInputDialog("Digite o cpf do cliente que deseja abrir a Conta Corrente:");
                        boolean clienteEncontrado = false;

                        for (Cliente c : clientes) {

                            if (c.getCpf().equals(cpfBuscado)) {
                                clienteEncontrado = true;
                                int resposta = JOptionPane.showConfirmDialog(null,
                                        "Cliente " + c.getNome() + " Encontrado", "Deseja Continuar?",
                                        JOptionPane.YES_NO_OPTION);

                                if (resposta == JOptionPane.YES_OPTION) {

                                    Conta conta = banco.abrirContaCorrente(c);

                                    JOptionPane.showMessageDialog(null,
                                            "Conta Corrente aberta com sucesso! \n Dados da Conta " + conta.toString());
                                    break;

                                } else {
                                    JOptionPane.showMessageDialog(null, "Operação cancelada!");
                                }
                                break;
                            }
                        }

                        if (!clienteEncontrado) {
                            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                        }

                    } catch (NoSuchElementException e) {
                        System.err.println(
                                "Lista de clientes vaiza!! Impossivel abrir conta. Cadastre um cliente para Continuar");
                    }

                    break;
                case 3:
                    // Código para abrir conta poupança
                    try {

                        if (clientes.isEmpty()) {
                            throw new NoSuchElementException();
                        }

                        String cpfBuscadoPoupanca = JOptionPane
                                .showInputDialog("Digite o cpf do cliente que deseja abrir a Conta Poupança:");
                        boolean clienteEncontrado = false;

                        for (Cliente c : clientes) {

                            if (c.getCpf().equals(cpfBuscadoPoupanca)) {
                                clienteEncontrado = true;
                                int resposta = JOptionPane.showConfirmDialog(null, "Cliente " + c.getNome() +
                                        "Encontrado", "Deseja Continuar?", JOptionPane.YES_NO_OPTION);

                                if (resposta == JOptionPane.YES_OPTION) {

                                    Conta conta = banco.abrirContaPoupanca(c);

                                    JOptionPane.showMessageDialog(null,
                                            "Conta Poupança aberta com sucesso! \n Dados da Conta " + conta.toString());
                                    break;

                                } else {
                                    JOptionPane.showMessageDialog(null, "Operação cancelada!");
                                }

                            }
                        }

                        if (!clienteEncontrado) {
                            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                        }

                    } catch (NoSuchElementException e) {
                        System.err.println(
                                "Lista de clientes vaiza!! Impossivel abrir conta. Cadastre um cliente para Continuar");
                    }
                    break;
                case 4:
                    // Código para fechar conta
                    try {

                        if (banco.verificarListaContaVazia()) {
                            throw new NoSuchElementException();
                        }

                        int numeroConta = Integer
                                .parseInt(JOptionPane.showInputDialog("Digite o número da conta que deseja fechar:"));

                        int resposta = JOptionPane.showConfirmDialog(null,
                                "Deseja realmente fechar a conta " + numeroConta +
                                        "?",
                                "Deseja Continuar?", JOptionPane.YES_NO_OPTION);

                        if (resposta == JOptionPane.YES_OPTION) {
                            banco.fecharConta(numeroConta);
                            JOptionPane.showMessageDialog(null, "Conta fechada com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Operação cancelada!");
                        }
                    } catch (NoSuchElementException e) {
                        System.err.println(
                                "Nao há registros de contas. Necessário cadastrar uma Conta Para realizar o fechamento");
                    }

                    break;
                case 5:
                    // Código para listar contas
                    try {
                        if (banco.verificarListaContaVazia()) {
                            throw new NoSuchElementException();
                        }
                        banco.listarContasContas();
                    } catch (NoSuchElementException e) {
                        System.err.println("\nNao há registros de contas.");
                    }

                    break;
                case 6:
                    // Código para listar clientes
                    try {
                        if (banco.verificarListaContaVazia()) {
                            throw new NoSuchElementException();
                        }
                        banco.listarClientes();
                    } catch (NoSuchElementException e) {
                        System.err.println("\nNao há registros de contas.");
                    }

                    break;
                case 7:

                    try {
                        if (clientes.isEmpty()) {
                            throw new NoSuchElementException();
                        }

                        for (Cliente c : clientes) {
                            System.out.println(c.toString());
                        }

                    } catch (NoSuchElementException e) {
                        System.err.println("\nNão há registros de Clientes Cadastrados");
                    }

                    break;
                case 8:
                    // Código para operações bancárias

                    try {
                        if (banco.verificarListaContaVazia()) {
                            throw new NoSuchElementException();
                        }

                        int numeroContaOperacao = Integer.parseInt(
                                JOptionPane
                                        .showInputDialog("Digite o número da conta que deseja realizar a operação:"));
                        Conta conta = banco.buscarConta(numeroContaOperacao);

                        if (conta != null) {
                            int operacao = Integer
                                    .parseInt(JOptionPane.showInputDialog("Digite a operação que deseja realizar: \n" +
                                            "1. Depositar \n" +
                                            "2. Sacar \n" +
                                            "3. Transferir \n" +
                                            "4. Consultar Saldo \n" +
                                            "5. Consultar extrato \n" +
                                            "6. Calcular Rendimento (Somente Conta Poupança)"));

                            switch (operacao) {
                                case 1:
                                    double valorDeposito = Double
                                            .parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
                                    conta.depositar(valorDeposito);
                                    JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                                    break;
                                case 2:
                                    try {
                                        double valorSaque = Double
                                                .parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
                                        conta.sacar(valorSaque);
                                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                                    } catch (IllegalArgumentException e) {
                                        System.err.println("Saldo insuficiente");
                                    }

                                    break;
                                case 3:

                                    try {
                                        int numeroContaDestino = Integer
                                                .parseInt(JOptionPane
                                                        .showInputDialog("Digite o número da conta destino:"));
                                        double valorTransferencia = Double
                                                .parseDouble(
                                                        JOptionPane
                                                                .showInputDialog("Digite o valor da transferência:"));
                                        Conta contaDestino = banco.buscarConta(numeroContaDestino);
                                        conta.transferir(valorTransferencia, contaDestino);
                                        JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso!");
                                    } catch (IllegalArgumentException e) {
                                        System.err.println("Saldo insuficiente para realizar transfêrencia");
                                    }

                                    break;
                                case 4:

                                    JOptionPane.showMessageDialog(null, "Saldo: " + conta.getSaldo());
                                    break;

                                case 5:

                                    conta.imprimrExtrato();
                                    break;

                                case 6:

                                    if (conta instanceof ContaPoupanca) {

                                        String meses = JOptionPane.showInputDialog(null,
                                                "Deseja verificar seu saldo na poupança após quantos meses de rendimento?");

                                        int qtdMeses = Integer.parseInt(meses);

                                        ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
                                        contaPoupanca.calculaRendimentoMensal(qtdMeses);
                                    } else {
                                        System.err.println("O número da conta deve fazer referência a uma Conta Poupança");
                                    }
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Operação inválida!");
                                    break;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Conta não encontrada!");
                        }

                    } catch (NoSuchElementException e) {
                        System.err.println(
                                "Nao há registros de contas. Necessário cadastrar uma Conta Para realizar as operações");
                    }

                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();

    }

    private static void exibeSelecaoMenu() {
        System.out.println("\n1. Cadastrar cliente");
        System.out.println("2. Abrir conta corrente");
        System.out.println("3. Abrir conta poupança");
        System.out.println("4. Fechar conta");
        System.out.println("5. Listar contas");
        System.out.println("6. Listar Clientes Com Contas Abertas");
        System.out.println("7. Listar Clientes");
        System.out.println("8.  Operações Bancarias");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");

    }

}

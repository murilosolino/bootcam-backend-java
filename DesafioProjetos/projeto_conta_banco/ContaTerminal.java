package DesafioProjetos.projeto_conta_banco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.printf("Digite o número da conta: ");
        numeroConta = scanner.nextInt();

        System.out.printf("Digite a agência: ");
        agencia = scanner.next();

        scanner.nextLine();

        System.out.printf("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.printf("Digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + "!" + "Obrigado por ter criado uma conta em nosso banco, sua agência é " + agencia + 
        " e o número da sua conta é " + numeroConta + ". Seu saldo atual é de R$" + saldo + ".");

        scanner.close();
    }
}

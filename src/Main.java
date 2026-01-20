import model.ContaTerminal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Criação de Conta Bancária ===");

        System.out.print("Número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Agência: ");
        String agencia = scanner.next();

        scanner.nextLine(); // limpa o buffer

        System.out.print("Nome do titular: ");
        String titular = scanner.nextLine();

        System.out.print("Saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, titular, saldoInicial);

        int opcao;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Ver dados da conta");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depósito: ");
                    conta.depositar(scanner.nextDouble());
                    break;

                case 2:
                    System.out.print("Valor para saque: ");
                    conta.sacar(scanner.nextDouble());
                    break;

                case 3:
                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                    break;

                case 4:
                    conta.exibirDados();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}

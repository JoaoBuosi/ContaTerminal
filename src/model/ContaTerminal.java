package model;

public class ContaTerminal {

    private final int numero;
    private final String agencia;
    private final String titular;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        saldo -= valor;
        System.out.println("Saque realizado com sucesso.");
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("Saldo atual: R$ " + saldo);
    }
}

package lista03.desafio05;

import java.time.LocalTime;

public class ContaBancaria {

    // Atributos
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private boolean contaAtiva;

    // Construtor
    public ContaBancaria(String nome, String cpf, String id, String banco, String end, double saldoInicial) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = id;
        this.banco = banco;
        this.endereco = end;
        this.saldo = saldoInicial;
        this.contaAtiva = true;
    }

    // Métodos
    public void saque(double valor) {
        if (!contaAtiva) {
            System.out.println("Operação não permitida. Conta encerrada.");
            return;
        }
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("ERRO: Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void deposito(double valor) {
        if (!contaAtiva) {
            System.out.println("Operação não permitida. Conta encerrada.");
            return;
        }
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        }
    }

    public void transferencia(double valor, ContaBancaria contaDestino) {
        LocalTime horarioAtual = LocalTime.now();
        LocalTime inicioPermitido = LocalTime.of(8, 0);
        LocalTime fimPermitido = LocalTime.of(19, 0);

        if (!contaAtiva) {
            System.out.println("Operação não permitida. Conta encerrada.");
            return;
        }

        if (horarioAtual.isAfter(inicioPermitido) && horarioAtual.isBefore(fimPermitido)) {
            if (valor > 0 && this.saldo >= valor) {
                this.saldo -= valor;
                contaDestino.deposito(valor);
                System.out.println("Transferência de R$" + valor + " para " + contaDestino.nome + " realizada.");
            } else {
                System.out.println("ERRO: Saldo insuficiente ou valor inválido.");
            }
        } else {
            System.out.println("ERRO: Transferências só podem ser feitas entre 8h e 19h.");
        }
    }

    public void alterarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
        System.out.println("Endereço alterado com sucesso para: " + novoEndereco);
    }

    public void fecharConta() {
        if (this.saldo == 0) {
            this.contaAtiva = false;
            System.out.println("Conta de " + this.nome + " encerrada com sucesso.");
        } else {
            System.out.println("ERRO: Para encerrar, o saldo deve ser zero. Saldo atual: R$" + this.saldo);
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual de " + this.nome + ": R$" + this.saldo);
    }

    public void verificarInformacoes() {
        System.out.println("\n--- Informações da Conta ---");
        System.out.println("Titular: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Banco: " + this.banco);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Status: " + (contaAtiva ? "Ativa" : "Encerrada"));
        System.out.println("--------------------------");
    }

    // Método principal para testar
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Eric", "123.456.789-00", "001", "Banco XPTO", "Rua A, 123", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("Maria", "987.654.321-00", "002", "Banco XPTO", "Rua B, 456", 500.0);

        conta1.verificarInformacoes();
        conta2.verificarInformacoes();

        conta1.saque(200);
        conta1.transferencia(300, conta2);

        conta1.verificarSaldo();
        conta2.verificarSaldo();

        conta1.fecharConta(); // não fecha porque ainda tem saldo
        conta1.saque(500);
        conta1.saque(300);
        conta1.fecharConta(); // agora fecha
    }
}

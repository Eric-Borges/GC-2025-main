package lista04.desafio06;
public class Main {
    public static void main(String[] args) {
        Negociador negociador = new Negociador();
        Divida dividaCartao = new DividaCartao(1500.00, "Banco X", "1234-5678-9012-3456");
        Divida dividaEmprestimo = new DividaEmprestimo(10000.00, "Financeira Y", 2.5);

        System.out.println("Iniciando negociações...");
        negociador.aplicarNegociacao(dividaCartao);
        negociador.aplicarNegociacao(dividaEmprestimo);
    }
}
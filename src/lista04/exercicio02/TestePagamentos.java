package lista04.exercicio02;

public class TestePagamentos {

    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCartao("Bruce Wayne");

        Pagamento pagamento2 = new PagamentoBoleto("12345.67890 09876.54321 10000.123456");

        System.out.println("--- Processando Pagamento 1 ---");
        pagamento1.processarPagamento();

        System.out.println("\n--- Processando Pagamento 2 ---");
        pagamento2.processarPagamento();
    }
}
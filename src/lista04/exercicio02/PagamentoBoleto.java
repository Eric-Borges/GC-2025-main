public class PagamentoBoleto implements Pagamento {
    private String codigoBoleto;

    public PagamentoBoleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com Boleto.");
        System.out.println("Código do Boleto: " + this.codigoBoleto);
        System.out.println("Boleto pago com sucesso!");
    }
}
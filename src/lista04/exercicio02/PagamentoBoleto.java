package lista04.exercicio02;
public class PagamentoBoleto implements Pagamento {
    private String codigoBoleto;

    public PagamentoBoleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void processarPagamento() {
        //Implementação específica para esta classe.
        System.out.println("Pagamento com Boleto processado.");
        System.out.println("Código do Boleto: " + this.codigoBoleto);
    }
}
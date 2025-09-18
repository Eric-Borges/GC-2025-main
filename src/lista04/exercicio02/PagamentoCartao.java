public class PagamentoCartao implements Pagamento {
    private String nomeDoTitular;

    public PagamentoCartao(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com Cartão de Crédito.");
        System.out.println("Nome do Titular: " + this.nomeDoTitular);
        System.out.println("Pagamento com cartão aprovado!");
    }
}
package lista04.exercicio02;
//À classe que vai implementar, usamos 'implements'.
public class PagamentoCartao implements Pagamento {
    private String nomeDoTitular;

    public PagamentoCartao(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento com Cartão processado.");
        System.out.println("Titular: " + this.nomeDoTitular);
    }
}
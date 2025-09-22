package lista04.desafio06;
public class DividaCartao extends Divida {
    private String numeroCartao;

    public DividaCartao(double valor, String credor, String numeroCartao) {
        super(valor, credor); // Chama o construtor da classe pai
        this.numeroCartao = numeroCartao;
    }


    @Override
    public double negociar() {
        System.out.println("Negociando dívida do cartão final " + numeroCartao.substring(numeroCartao.length() - 4));
        //Regra específica: desconto de 15% para dívida de cartão.
        double valorNegociado = this.valor * 0.85;
        return valorNegociado;
    }
}
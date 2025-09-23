package lista04.desafio06;
// Esta classe também herda de Divida.
public class DividaEmprestimo extends Divida {
    private double taxaDeJuros;

    public DividaEmprestimo(double valor, String credor, double taxaDeJuros) {
        super(valor, credor);
        this.taxaDeJuros = taxaDeJuros;
    }

    //Implementação do método é diferente da outra classe.
    @Override
    public double negociar() {
        System.out.println("Negociando dívida de empréstimo com juros de " + taxaDeJuros + "%");
        // Regra específica: desconto de 5% para empréstimo.
        double valorNegociado = this.valor * 0.95;
        return valorNegociado;
    }
}
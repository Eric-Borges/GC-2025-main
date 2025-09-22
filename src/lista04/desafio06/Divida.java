package lista04.desafio06;

public abstract class Divida {
    protected double valor;
    protected String credor;

    public Divida(double valor, String credor) {
        this.valor = valor;
        this.credor = credor;
    }

    public double getValor() {
        return valor;
    }

    public void exibirInformacoes() {
        System.out.println("Credor: " + credor);
        System.out.println("Valor Original: R$" + valor);
    }

    //Apenas declaro o método, deixando a implementação para quem for herdar.
    public abstract double negociar();
}
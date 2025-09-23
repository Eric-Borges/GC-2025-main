package lista04.desafio06;
public class Negociador {
    //Este método aceita qualquer objeto que seja uma 'Divida' (seja Cartao ou Emprestimo).
    public void aplicarNegociacao(Divida divida) {
        System.out.println("-------------------------------------");
        divida.exibirInformacoes();
        double valorFinal = divida.negociar();

        System.out.printf("Valor final após negociação: R$%.2f\n", valorFinal);
        System.out.println("-------------------------------------");
    }
}
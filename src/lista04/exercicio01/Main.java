package lista04.exercicio01;

public class Main {
    public static void main(String[] args) {
        // 1. Criamos instâncias (objetos) de Carro e Moto ANTES DE DAR SOUT.
        Carro meuCarro = new Carro("Ford", "Ka", 2020, 4);
        Moto minhaMoto = new Moto("Honda", "CB 500", 2022, "Esportivo");

        // 2. Chamamos o método "informacoes()" EM CADA OBJETO
        System.out.println("Informações do Carro: " + meuCarro.informacoes());
        System.out.println("Informações da Moto: " + minhaMoto.informacoes());
    }
}
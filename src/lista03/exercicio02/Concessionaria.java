package lista03.exercicio02;

public class Concessionaria {

    private Carro[] estoque;
    private int carrosNoEstoque;

    // Construtor
    public Concessionaria() {
        this.estoque = new Carro[10];
        this.carrosNoEstoque = 0;
    }

    // Método para adicionar carro no estoque
    public void adicionarCarro(Carro carro) {
        if (carrosNoEstoque < 10) {
            this.estoque[carrosNoEstoque] = carro;
            this.carrosNoEstoque++;
            System.out.println("Carro " + carro.getModelo() + " adicionado ao estoque.");
        } else {
            System.out.println("Estoque cheio! Não é possível adicionar mais carros.");
        }
    }

    // Método para listar carros do estoque
    public void listarCarros() {
        System.out.println("\n--- Carros Cadastrados na Concessionária ---");
        for (int i = 0; i < carrosNoEstoque; i++) {
            estoque[i].exibirDados();
            System.out.println();
        }
    }

    // Método principal
    public static void main(String[] args) {
        Concessionaria loja = new Concessionaria();

        Carro carro1 = new Carro("Toyota", "Corolla", 2020, "Prata");
        Carro carro2 = new Carro("Honda", "Civic", 2021, "Preto");

        loja.adicionarCarro(carro1);
        loja.adicionarCarro(carro2);

        loja.listarCarros();
    }
}

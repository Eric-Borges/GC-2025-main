package lista04.exercicio01;

public class Carro extends Veiculo {
    private int numeroDePortas;

    // Construtor da subclasse
    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        // Chama o construtor da classe pai (Veiculo)
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override // Anotação que indica a sobrescrita de um método
    public String informacoes() {
        // Chama o método da classe pai e adiciona a nova informação
        return super.informacoes() + ", Número de Portas: " + numeroDePortas;
    }
}
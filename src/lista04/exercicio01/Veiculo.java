package lista04.exercicio01;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor para inicializar os atributos
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método que retorna as informações básicas do veículo
    public String informacoes() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
    }
}
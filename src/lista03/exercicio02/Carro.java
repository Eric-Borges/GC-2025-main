package lista03.exercicio02;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibirDados() {
        System.out.println("--- Informações do Carro ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
    }

    public String getModelo() {
        return this.modelo;
    }
}
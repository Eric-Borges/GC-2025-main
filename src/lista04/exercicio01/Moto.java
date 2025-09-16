package lista04.exercicio01;

// A palavra "extends" indica que Moto herda de Veiculo
public class Moto extends Veiculo {
    private String tipoDeGuidao;

    // Construtor da subclasse
    public Moto(String marca, String modelo, int ano, String tipoDeGuidao) {
        // Chama o construtor da classe pai (Veiculo)
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    // Sobrescreve o método da classe pai para incluir informações adicionais
    @Override // Anotação que indica a sobrescrita de um método.
    public String informacoes() {
        // Chama o método original da classe pai e adiciona o novo atributo
        return super.informacoes() + ", Tipo de Guidão: " + tipoDeGuidao;
    }
}
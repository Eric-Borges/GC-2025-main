public class Cadeira {

    private String cor;
    private int numeroDePernas;
    private String material;
    private boolean ocupada;


    public Cadeira(String corInicial, int pernas, String materialDaCadeira) {

        this.cor = corInicial;
        this.numeroDePernas = pernas;
        this.material = materialDaCadeira;
        this.ocupada = false; // Uma cadeira nova começa desocupada.
    }

    public void ocupar() {
        this.ocupada = true;
        System.out.println("A cadeira foi ocupada.");
    }


    public void desocupar() {
        this.ocupada = false;
        System.out.println("A cadeira foi desocupada.");
    }

    public void pintar(String novaCor) {
        this.cor = novaCor;
        System.out.println("A cor da cadeira foi alterada para " + novaCor + ".");
    }


    public String getCor() {
        return this.cor;
    }


    public void exibirStatus() {
        System.out.println("--- Status da Cadeira ---");
        System.out.println("Material: " + this.material);
        System.out.println("Cor: " + this.cor);
        System.out.println("Número de Pernas: " + this.numeroDePernas);
        System.out.println("Está ocupada? " + this.ocupada);
        System.out.println("-------------------------");
    }

    // Método principal só para testar a classe
    public static void main(String[] args) {
        Cadeira cadeira1 = new Cadeira("Azul", 4, "Madeira");

        cadeira1.exibirStatus();
        cadeira1.ocupar();
        cadeira1.exibirStatus();
        cadeira1.desocupar();
        cadeira1.pintar("Vermelha");
        cadeira1.exibirStatus();
    }
}

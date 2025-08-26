package lista01.desafio01;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // agora o double aceita ponto (1.75)
        Pessoa pessoa = new Pessoa();
        pessoa.nome = lerString(sc, "Digite seu nome: ");
        pessoa.idade = lerInt(sc, "Digite sua idade: ");
        pessoa.possuiCadastro = lerBoolean(sc, "Possui cadastro (true/false): ");
        pessoa.cpf = lerString(sc, "Digite seu CPF: ");
        pessoa.telefone = lerString(sc, "Digite seu telefone: ");
        pessoa.altura = lerDouble(sc, "Digite sua altura em metros (ex: 1.75): ");
        pessoa.exibirDados();
        sc.close();
    }

    static class Pessoa {
        String nome;
        int idade;
        boolean possuiCadastro;
        String cpf;
        String telefone;
        double altura;

        void exibirDados() {
            System.out.println("\n--- Dados cadastrados ---");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Possui cadastro: " + possuiCadastro);
            System.out.println("CPF: " + cpf);
            System.out.println("Telefone: " + telefone);
            System.out.println("Altura: " + altura + "m");
        }
    }

    public static String lerString(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }

    public static int lerInt(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        int valor = sc.nextInt();
        sc.nextLine();
        return valor;
    }

    public static boolean lerBoolean(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        boolean valor = sc.nextBoolean();
        sc.nextLine();
        return valor;
    }

    public static double lerDouble(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        double valor = sc.nextDouble();
        sc.nextLine();
        return valor;
    }
}

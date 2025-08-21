package timeattack.desafio03;

import java.util.Scanner;

public class Main {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        dadosFinais();
    }

    public static String nome() {
        System.out.print("Qual seu nome? ");
        return leitor.next();
    }

    public static String sobrenome() {
        System.out.print("Qual seu sobrenome? ");
        return leitor.next();
    }

    public static int idade() {
        System.out.print("Qual sua idade? ");
        return leitor.nextInt();
    }

    public static String fraseDigitada() {
        leitor.nextLine(); // consome o Enter deixado pelo nextInt()
        System.out.print("Digite uma frase favorita: ");
        return leitor.nextLine();
    }

    public static void dadosFinais() {
        System.out.printf("Nome: %s %s\nIdade: %d\nFrase favorita: %s\n",
                          nome(), sobrenome(), idade(), fraseDigitada());
    }
}

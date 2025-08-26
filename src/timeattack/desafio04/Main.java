package timeattack.desafio04;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int nota = obterNota();
        sc.close();

        if (nota < 6) {
            System.out.println("Voce foi reprovado");
        } else {
            System.out.println("Voce foi aprovado");
        }
    }

    public static int obterNota() {
        System.out.print("Qual foi sua nota? ");
        return sc.nextInt();
    }
}
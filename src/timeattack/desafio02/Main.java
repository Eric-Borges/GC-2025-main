package timeattack.desafio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primeiro = numero(sc);
        int segundo = number(sc);
        int resultado = soma(primeiro, segundo);

        System.out.println("A soma é: " + resultado);

        sc.close();
    }

    public static int numero(Scanner sc) {
        System.out.print("Qual o primeiro numero? ");
        return sc.nextInt();
    }

    public static int number(Scanner sc) {
        System.out.print("Qual o segundo numero? ");
        return sc.nextInt();
    }

    public static int soma(int n1, int n2) {
        return n1 + n2;
    }
}

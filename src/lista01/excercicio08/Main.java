package lista01.excercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int anoNascimento = pegaAno();
        voto(anoNascimento);

    }

    public static int pegaAno() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma data de nascimento: ");
        int data = sc.nextInt();
        sc.close();
        return data;

    }

    public static void voto(int anoNascimento) {
        int anoAtual = 2025;
        int idade = anoAtual - anoNascimento;
        if (idade >= 16) {
            System.out.println("Você tem " + idade + "anos. Pode votar.");
        }
        else {
            System.out.println("Você tem "+idade+"anos. Ainda não pode votar");
        }
    }
}
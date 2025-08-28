package lista02.exercicio03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a sua comida favorita? ");
        String comidaFavorita = scanner.nextLine();
        String invertePalavra = new StringBuilder(comidaFavorita).reverse().toString();
        System.out.println(invertePalavra);
        scanner.close();
    }
}
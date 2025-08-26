package lista02.exercicio02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String texto = sc.nextLine();

        // Calcula o meio
        int meio = texto.length() / 2;
        // Pega a primeira metade
        String primeiraParte = texto.substring(0, meio);
        System.out.println("Primeira metade: " + primeiraParte);

        sc.close();
    }
}

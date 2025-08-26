package lista02.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial do intervalo: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o número final do intervalo: ");
        int fim = sc.nextInt();

        System.out.println("\nNúmeros primos no intervalo [" + inicio + ", " + fim + "]:");

        // Estrutura de repetição for
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero < 2) return false; // 0 e 1 não são primos
        for (int i = 2; i <= Math.sqrt(numero); i++) { // otimização
            if (numero % i == 0) return false;
        }
        return true;
    }}
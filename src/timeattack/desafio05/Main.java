package timeattack.desafio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = obterNumero();
        int num2 = obterNumero();
        int num3 = obterNumero();

        obterMaiorNumero(num1, num2, num3);

        double media = calcularMedia(num1, num2, num3);
        System.out.println("Média aritmética: " + media);
    }

    public static int obterNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        sc.close();
        return numero;
    }

    public static int obterMaiorNumero(int primeiroNumero, int segundoNumero, int terceiroNumero) {
        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            System.out.println("Maior numero: " + primeiroNumero);
            return primeiroNumero;
        } else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.println("Maior numero: " + segundoNumero);
            return segundoNumero;
        } else {
            System.out.println("Maior numero: " + terceiroNumero);
            return terceiroNumero;
        }
    }

    public static double calcularMedia(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3.0; // usa 3.0 para dar resultado decimal
    }
}

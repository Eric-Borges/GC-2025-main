package desafiozinho.desafio01;

import java.util.Scanner;

public class MatrixDiagonal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Por favor preencha uma matriz 3x3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Coloque os elementos da posicao (%d, %d): ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nMain Diagonal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        scanner.close();
    }
}
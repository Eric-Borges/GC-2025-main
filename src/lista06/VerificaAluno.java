package lista06.exercicio03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VerificaAluno {
    public static void main(String[] args) {
        Set<String> nomesEstudantes = new HashSet<>();
        nomesEstudantes.add("Ana");
        nomesEstudantes.add("Carlos");
        nomesEstudantes.add("Beatriz");
        nomesEstudantes.add("Daniel");

        System.out.println("--- Verificação de Aluno (Exercício 3) ---");
        System.out.println("Alunos na turma: " + nomesEstudantes);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um nome para verificar se está na lista: ");
        String nomeParaBuscar = scanner.nextLine();

        if (nomesEstudantes.contains(nomeParaBuscar)) {
            System.out.printf("Saída: O nome %s está presente no conjunto.\n", nomeParaBuscar);
        } else {
            System.out.printf("Saída: O nome %s NÃO está presente no conjunto.\n", nomeParaBuscar);
        }

        scanner.close();
        System.out.println(); // Linha em branco para separar
    }
}

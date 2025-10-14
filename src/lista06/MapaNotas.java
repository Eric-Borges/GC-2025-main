package lista06.exercicio04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapaNotas {
    public static void main(String[] args) {
        Map<String, Double> mapaDeNotas = new HashMap<>();

        // Adicionando alunos e notas com o método .put()
        mapaDeNotas.put("Ana", 8.5);
        mapaDeNotas.put("Carlos", 9.0);
        mapaDeNotas.put("Beatriz", 7.8);

        System.out.println("--- Mapa de Notas de Alunos (Exercício 4) ---");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno para ver sua nota: ");
        String nomeAluno = scanner.nextLine();

        // Método .get() para buscar o valor associado à chave
        Double nota = mapaDeNotas.get(nomeAluno);

        if (nota != null) {
            System.out.printf("Saída: Nota de %s: %.1f\n", nomeAluno, nota);
        } else {
            System.out.printf("Saída: Aluno %s não encontrado no sistema.\n", nomeAluno);
        }

        scanner.close();
        System.out.println(); // Linha em branco para separar
    }
}

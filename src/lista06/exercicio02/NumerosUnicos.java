package lista06.exercicio02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumerosUnicos {
    public static Set<Integer> obterNumerosUnicos(List<Integer> listaDeNumeros) {
        Set<Integer> numerosUnicos = new HashSet<>();

        for (Integer numero : listaDeNumeros) {
            numerosUnicos.add(numero);
        }

        return numerosUnicos;
    }

    public static void main(String[] args) {
        List<Integer> entrada = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 10, 3, 7, 10);

        System.out.println("Lista de Entrada: " + entrada);

        Set<Integer> saida = obterNumerosUnicos(entrada);

        System.out.println("Conjunto Resultante (Números Únicos): " + saida);
    }
}


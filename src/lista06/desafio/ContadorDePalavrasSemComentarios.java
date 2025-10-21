package lista06.desafio;
import java.util.HashMap;
import java.util.Map;

public class ContadorDePalavrasSemComentarios {
    public static Map<String, Integer> contarFrequenciaPalavras(String frase) {
        Map<String, Integer> frequenciaPalavras = new HashMap<>();

        // padroniza a frase: minúsculas e remove pontuação (mantendo acentos e ç)
        String fraseNormalizada = frase.toLowerCase().replaceAll("[^a-zA-Záéíóúâêîôûãõç\s]", "");

        // Separa as palavras por um ou mais espaços
        String[] palavras = fraseNormalizada.split("\s+");

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                frequenciaPalavras.put(palavra, frequenciaPalavras.getOrDefault(palavra, 0) + 1);
            }
        }

        return frequenciaPalavras;
    }

    public static void main(String[] args) {
        String entrada1 = "O rato roeu a roupa do rei de Roma";
        System.out.println("Entrada: " + entrada1);
        Map<String, Integer> saida1 = contarFrequenciaPalavras(entrada1);
        System.out.println("Saída: " + saida1);

        System.out.println("----------------------------------------");

        String entrada2 = "Eu amo Java. Amo muito, muito Java.";
        System.out.println("Entrada: " + entrada2);
        Map<String, Integer> saida2 = contarFrequenciaPalavras(entrada2);
        System.out.println("Saída: " + saida2);
    }
}
package lista02.exercicio03;

import java.util.Scanner; // Importa a classe Scanner para ler entrada do usuário

public class cleber{ // Declaração da classe principal
    public static void main(String[] args){ // Método principal onde a execução do programa começa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler do console
        String input = scanner.nextLine(); // Lê a linha de entrada do usuário
        System.out.println(devolveAoContrario(input)); // Chama o método devolveAoContrario e imprime o resultado
        scanner.close(); // Fecha o objeto Scanner para liberar recursos
    }

    //Método para retornar uma string ao contrário
    public static String devolveAoContrario(String comida) {
        // Cria um array de caracteres para armazenar a string invertida
        char[] comidaAoContrario = new char[comida.length()];
        int contador = 0; // Inicializa um contador para a posição no array comidaAoContrario

        // Loop para percorrer a string original de trás para frente
        for(int i = comida.length() -1; i >=0; i--){
            // Copia o caractere da posição i da string original para a posição contador no array invertido
            comidaAoContrario[contador] = comida.charAt(i);
            contador++; // Incrementa o contador
        }
        // Cria uma nova string a partir do array de caracteres invertido e a retorna
        return new String(comidaAoContrario);
    }
}
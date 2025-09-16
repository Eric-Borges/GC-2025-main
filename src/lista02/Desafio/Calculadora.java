package lista02.Desafio;
import java.util.Scanner;
//Criei o código sozinho, mas com comentários explicando como se tivesse codando com alguém.

public class Calculadora {

    public static void main(String[] args) {
        // O Scanner vai ser a nossa ferramenta para pegar os dados do teclado.
        Scanner entrada = new Scanner(System.in);

        // Usei 'char' para a operação, porque é só um símbolo (+, -, *, /).
        char operacao;
        double num1, num2, resultado;

        // Criei essa variável para controlar o loop. Começa com 's' para entrar a primeira vez.
        char continuar = 's';


        // O código dentro do 'do' vai rodar pelo menos uma vez, e só no final ele
        // pergunta se a gente quer continuar.
        do {
            System.out.println("\n--- Calculadora Simples ---");
            System.out.print("Digite o primeiro número: ");
            num1 = entrada.nextDouble();

            // Criei um array de Strings para guardar as opções do menu.
            String[] menuOpcoes = {
                    "[+] Soma",
                    "[-] Subtração",
                    "[*] Multiplicação",
                    "[/] Divisão",
                    "[^] Exponenciação (potência)",
                    "[r] Raiz Quadrada"
            };

            System.out.println("\nEscolha a operação:");


            // Usei o "for diferentão" para percorrer o array e imprimir cada opção do menu.
            // Fica mais limpo do que várias linhas de System.out.println.
            for (String opcao : menuOpcoes) {
                System.out.println(opcao);
            }

            System.out.print("Operação: ");
            // Pega o primeiro caractere da string digitada.
            operacao = entrada.next().charAt(0);

            resultado = 0; // Inicializo o resultado para garantir que não tenha lixo.

            // Para escolher a operação, vou usar o 'switch'.
            switch (operacao) {
                case '+':
                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();
                    resultado = num1 + num2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;

                case '-':
                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();
                    resultado = num1 - num2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;

                case '*':
                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();
                    resultado = num1 * num2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;

                case '/':
                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();
                    // Não dá pra dividir por zero!
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.printf("Resultado: %.2f\n", resultado);
                    } else {
                        System.out.println("Erro! Divisão por zero não é permitida.");
                    }
                    break;

                case '^':
                    System.out.print("Digite o expoente (deve ser um número inteiro): ");
                    num2 = entrada.nextDouble();

                    if (num2 != (int)num2) {
                        System.out.println("Erro! Este método simplificado só aceita expoentes inteiros.");
                    } else {
                        resultado = 1;
                        for (int i = 0; i < num2; i++) {
                            resultado = resultado * num1;
                        }
                        System.out.printf("Resultado: %.2f\n", resultado);
                    }
                    break;

                case 'r':
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                        System.out.printf("Resultado: %.2f\n", resultado);
                    } else {
                        System.out.println("Erro! Não existe raiz real de número negativo.");
                    }
                    break;

                default:
                    System.out.println("Operação inválida! Tente novamente.");
                    break;
            }

            System.out.print("\nDeseja realizar outra operação? (s/n): ");
            continuar = entrada.next().charAt(0);

        } while (continuar != 'n' && continuar != 'N');

        System.out.println("\nPrograma encerrado!");
        entrada.close();
    }
}


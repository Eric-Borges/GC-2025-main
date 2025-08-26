package lista01.desafio02;
import java.util.Scanner;

public class Main {
    // Constantes que não mudam.
    private static final double SALARIO_BASE = 2000.00;
    private static final double VALOR_HORA_EXTRA = 50.00;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasExtras = lerInt(sc, "Digite a quantidade de horas extras trabalhadas: ");

        double salarioTotal = calcularSalarioTotal(horasExtras);

        exibirResultado(horasExtras, salarioTotal);

        sc.close();
    }

    // Método para calcular o salário total
    public static double calcularSalarioTotal(int horasExtras) {
        return SALARIO_BASE + (horasExtras * VALOR_HORA_EXTRA);
    }

    // Método para exibir os resultados
    public static void exibirResultado(int horasExtras, double salarioTotal) {
        System.out.println("\n--- Cálculo de Salário ---");
        System.out.println("Salário base: R$ " + SALARIO_BASE);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Valor por hora extra: R$ " + VALOR_HORA_EXTRA);
        System.out.println("Salário total: R$ " + salarioTotal);
    }

    // Método auxiliar para leitura de inteiros
    public static int lerInt(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        return sc.nextInt();
    }
}

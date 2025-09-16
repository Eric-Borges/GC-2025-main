package lista01.desafio04;//
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = lerDouble(sc, "Digite a temperatura em Celsius: ");
        double fahrenheit = converterParaFahrenheit(celsius);
        exibirResultado(celsius, fahrenheit);
        sc.close();
    }
    public static double converterParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public static void exibirResultado(double celsius, double fahrenheit) {
        System.out.println("\n--- Conversão de Temperatura ---");
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
    public static double lerDouble(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        return sc.nextDouble();
    }
}

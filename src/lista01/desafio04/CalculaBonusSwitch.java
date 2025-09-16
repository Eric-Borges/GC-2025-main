package desafio04;

import java.util.Scanner;

public class CalculaBonusSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: ");
        double salario = sc.nextDouble();
        sc.nextLine(); // consome a quebra de linha

        System.out.print("Digite o nível do funcionário (Ouro, Platina, Diamante): ");
        String nivel = sc.nextLine();

        double novoSalario = salario; // valor inicial

        switch (nivel) {
            case "Ouro":
                novoSalario = salario + (salario * 0.10);
                break;
            case "Platina":
                novoSalario = salario + (salario * 0.25);
                break;
            case "Diamante":
                novoSalario = salario + (salario * 0.30);
                break;
            default:
                System.out.println("Nível inválido!");
        }

        System.out.println("Novo salário: R$ " + novoSalario);

        sc.close();
    }
}

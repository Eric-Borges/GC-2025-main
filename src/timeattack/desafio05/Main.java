package timeattack.desafio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = obterNumero();
        int num2 = obterNumero();
        int num3 = obterNumero();
        obterMaiorNumero(num1, num2, num3);


    }

    public static int obterNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero ");
        int numero = sc.nextInt();
        return numero;
    }

    public static int obterMaiorNumero(int primeiroNumero, int segundoNumero, int terceiroNumero) {


        if (primeiroNumero > segundoNumero && primeiroNumero> terceiroNumero){
            System.out.println("Maior numero: " + primeiroNumero);
            return primeiroNumero;
        } else if(segundoNumero> primeiroNumero && segundoNumero> terceiroNumero) {
            System.out.println("Maior numero:"+ segundoNumero);
            return segundoNumero;
        }
        else{
            System.out.println("Maior numero:" + terceiroNumero);
            return terceiroNumero;
        }
    }

}
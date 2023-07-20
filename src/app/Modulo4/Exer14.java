package app.Modulo4;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o salario minimo: ");
        int salarioMin = sc.nextInt();
        System.out.println("Entre com a quantidade de quilowatt: ");
        int qtdQuilowatt = sc.nextInt();
        int precoQuilowatt = salarioMin /5;
        int valorQuilowatt = qtdQuilowatt * precoQuilowatt;
        int desconto = (valorQuilowatt * 15) /100;
        int valorFinal = valorQuilowatt - desconto;
        System.out.println("O valor a ser pago sem desconto: " + valorQuilowatt);
        System.out.println("Valor a ser pago com desconto de 15%: " + valorFinal);
    }
}

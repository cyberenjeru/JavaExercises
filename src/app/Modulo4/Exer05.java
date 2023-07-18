package app.Modulo4;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o salário base do funcionário para calcularmos o salário final que o funcionário irá receber.");
        System.out.println("Salário do funcionário: ");
        double salario = scan.nextDouble();
        double gratificacao = (salario * 5) /100;
        double imposto = (salario * 7) /100;
        double salarioFinal = (salario - imposto) + gratificacao;
        System.out.println("O desconto do imposto foi de: " + imposto);
        System.out.println("A gratificação do funcionário foi de: " + gratificacao);
        System.out.println("O salário final do funcionário foi de: " + salarioFinal);
    }
}

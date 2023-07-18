package app.Modulo4;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o salário do funcionário e o valor de suas vendas para descobrir o salário final do funcionário.");
        System.out.println("Salário do funcionário: ");
        double salario = scan.nextDouble();
        System.out.println("Valor de suas vendas: ");
        double vendas = scan.nextDouble();
        double comissao = (vendas * 4) /100;
        double salarioFinal = salario + comissao;
        System.out.println("Comissão: " + comissao);
        System.out.println("Salário final com a comissão: " + salarioFinal);
    }
}

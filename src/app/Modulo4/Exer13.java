package app.Modulo4;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a quantidade de horas trabalhadas: ");
        int qtdHoras = scan.nextInt();
        System.out.println("Entre com o salário minímo: ");
        int salarioMin = scan.nextInt();
        int valorHora = (salarioMin * 10)/100;
        int salarioBruto = qtdHoras * valorHora;
        int imposto = (salarioBruto * 3) /100;
        int salarioLiquido = salarioBruto - imposto;
        System.out.println("O salário bruto foi de: " + salarioBruto);
        System.out.println("A quantidade de impostos pagos foi de: " + imposto);
        System.out.println("O salário a receber foi de: " + salarioLiquido);
    }
}

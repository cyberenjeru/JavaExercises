package app.Modulo4;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro número: ");
        double firstNum = scan.nextDouble();
        System.out.println("Entre com o segundo número: ");
        double secoundNum = scan.nextDouble();
        double resultado = firstNum - secoundNum;
        System.out.println("O resultado da subtração entre o primeiro e o segundo número é: " + resultado);
    }
}

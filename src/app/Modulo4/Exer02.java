package app.Modulo4;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro número: ");
        double firstNum = scan.nextDouble();
        System.out.println("Entre com o segundo número: ");
        double secondNum = scan.nextDouble();
        double result = firstNum / secondNum;
        System.out.println("O resultado da divisão entre o primeiro e o segundo número é: " + result);
    }
}

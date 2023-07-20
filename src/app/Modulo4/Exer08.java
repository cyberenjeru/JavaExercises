package app.Modulo4;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Para calcular a área de um triângulo entre com a base e a altura, respectivamente: ");
        double base = scan.nextDouble();
        double altura = scan.nextDouble();
        double area = base * altura;
        System.out.println("A área do triângulo é de: " + area);

    }
}

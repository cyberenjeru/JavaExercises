package app.Modulo4;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Para calcular a área do quadrdo entre com o lado: ");
        double lado = scan.nextDouble();
        double area = lado * lado;
        System.out.println("A área do quadrado é de:" + area);
    }
}

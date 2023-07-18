package app.Modulo4;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com as notas do aluno.");
        System.out.println("Nota 1: ");
        double grade1 = scan.nextDouble();
        System.out.println("Nota 2: ");
        double grade2 = scan.nextDouble();
        System.out.println("Nota 3: ");
        double grade3 = scan.nextDouble();

        double media = (grade1 + grade2 + grade3) /3;
        System.out.println("A média das notas do aluno: " + media);
    }
}

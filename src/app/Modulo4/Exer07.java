package app.Modulo4;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a nota 1: ");
        double nota1 = scan.nextDouble();
        System.out.println("Entre com o peso da nota 1: ");
        double peso1 = scan.nextDouble();
        System.out.println("Entre com a nota 2: ");
        double nota2 = scan.nextDouble();
        System.out.println("Entre com o peso da nota 2: ");
        double peso2 = scan.nextDouble();
        System.out.println("Entre com a nota 3: ");
        double nota3 = scan.nextDouble();
        System.out.println("Entre com o peso da nota 3: ");
        double peso3 = scan.nextDouble();

        double somaPesos = peso1 + peso2 + peso3;
        double notaComPeso1 = nota1 * peso1;
        double notaComPeso2 = nota2 * peso2;
        double notaComPeso3 = nota3 * peso3;
        double somaNotas = notaComPeso1 + notaComPeso2 + notaComPeso3;
        double media = somaNotas / somaPesos;
        System.out.println("A média final do aluno foi de: " + media);
        System.out.println("A soma dos pesos foi de: " + somaPesos);
        System.out.println("A soma das notas com pesos foi de: " + somaNotas);
    }
}

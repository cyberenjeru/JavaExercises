package app.Modulo4;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o ano de nascimento e o ano atual, respectivamente: ");
        int anoNascimento = scan.nextInt();
        int anoAtual = scan.nextInt();
        int idadeAnos = anoAtual - anoNascimento;
        int idadeMeses = idadeAnos * 12;
        int idadeSemanas = idadeAnos * 52;
        int idadeDias = idadeAnos * 365;
        System.out.println("A idade em anos é de: " + idadeAnos + "em meses: " + idadeMeses + "em semanas: " + idadeSemanas + "em dias: " + idadeDias);
    }
}

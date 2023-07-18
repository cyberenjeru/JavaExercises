package app.Modulo4;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o preço do produto desejado para calcular o preço com desconto: ");
        double preco = scan.nextDouble();
        double desconto = (preco * 10) / 100;
        double precoFinal = preco - desconto;
        System.out.println("O preço do produto é: " + preco + " ; com o desconto de 10% teve o desconto de: " + desconto + " e o valor final do produto ficou: " + precoFinal);
    }
}

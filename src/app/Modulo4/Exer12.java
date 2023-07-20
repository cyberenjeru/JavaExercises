package app.Modulo4;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o preço de fábrica do veículo: ");
        double precoFabrica = scan.nextDouble();
        System.out.println("Entre com o percentual da distribuídora: ");
        double percentualDistribuidora = scan.nextDouble();
        System.out.println("Entre com o percentual de impsotos: ");
        double percentualImpostos = scan.nextDouble();

        double lucro = (precoFabrica * percentualDistribuidora) /100;
        double impostos = (precoFabrica * percentualImpostos) /100;
        double precoFinal = precoFabrica + lucro + impostos;
        System.out.println("O preço final do veículo foi de: " + precoFinal);
        System.out.println("Os impostos sobre o veículo foi de: " + impostos);
        System.out.println("O lucro do vendedor foi de: " + lucro);
    }
    }


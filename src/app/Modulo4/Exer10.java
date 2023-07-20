package app.Modulo4;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a medida em pés para realizar a conversão para polegadas, jardas e milhas:");
        double pes = scan.nextDouble();
        double polegadas = pes * 12;
        double jardas = pes / 3;
        double milhas = pes / 5280;
        System.out.println("Valor em polegadas: " + polegadas);
        System.out.println("Valor em jardas: " + jardas);
        System.out.println("Valor em milhas: " + milhas);


    }
}

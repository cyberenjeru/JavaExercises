package app.Modulo4;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a temperatura em Celsius para converter em Fahrenheit: ");
        double temperaturaC = scan.nextDouble();
        double temperaturaF = (9 * temperaturaC / 5) + 32;
        System.out.println(temperaturaF);
    }
}

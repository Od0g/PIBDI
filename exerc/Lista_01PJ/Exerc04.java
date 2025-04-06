package exerc.Lista_01PJ;

import java.util.Scanner;

public class Exerc04 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.println("o antecessor de " + A +" é: "+ (A - 1) + "\n");
        System.out.println("o sucessor de " + A +" é: " + (A + 1) + "\n");

        scanner.close();

    }
}

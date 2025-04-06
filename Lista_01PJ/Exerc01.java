import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        int SAB = A + B;

        if (SAB > C) {
            System.out.println("A soma " + A + " + " + B + " = " + SAB + " é maior que " + C);
        } else if (SAB < C) {
            System.out.println("A soma " + A + " + " + B + " = " + SAB + " é menor que " + C);
        } else {
            System.out.println("A soma de " + A + " + " + B + " é igual a " + C);
        }

        scanner.close();
    }
}


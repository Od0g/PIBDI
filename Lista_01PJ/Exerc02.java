import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        if (A / 2 == 0) {
            System.out.println("O número " + A + " é par.");
        } else {
            System.out.println("O número " + A + " é ímpar.");
        }        


        scanner.close();
    }
    
}

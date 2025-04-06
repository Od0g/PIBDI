package exerc.Lista_01PJ;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: " );
        int A = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = scanner.nextInt();

        if (A > B || B > A) {
            System.out.println("A soma dos valores é: " + (A + B));
        } else {
            System.out.println("A multiplicação dos valores é: " + (A * B));
        } ;

        scanner.close();
    }
    
}


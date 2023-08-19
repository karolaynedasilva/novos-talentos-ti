/*Faça um programa para calcular a quantidade de carne necessária para um churrasco de acordo com
o número de pessoas convidadas. Considere que todas são adultas e que um adulto consome 250 gramas de carne por refeição. */

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int pessoas = 0;
        float carne = 250f;

        System.out.println("Digite quantas pessoas vão no churrasco: ");
        pessoas = Integer.parseInt(leitor.nextLine());

        float qtdcarne = pessoas * carne;

        System.out.println("A quantidade de carne necessária é "+ qtdcarne+ " gramas");

        leitor.close();

    }
}

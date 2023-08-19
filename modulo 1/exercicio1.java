/* Faça um programa que solicite o número de horas que um trabalhador 
realiza por dia solicite o número de dias trabalhados em um mês e 
apresente o número total de horas trabalhadas no mês. */

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        float horastrabalhadas;
        int diastrabalhados; 

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua carga horária: ");
        horastrabalhadas = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quantidade de dias trabalhados em um mês");
        diastrabalhados = Integer.parseInt(leitor.nextLine());

        var carga = horastrabalhadas * diastrabalhados;

        System.out.println("Você trabalha "+carga+" horas no mês");

        leitor.close();

    }
}
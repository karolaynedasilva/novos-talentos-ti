/*Faça um programa que calcule o valor de reembolso de despesas de combustível de um funcionário. 
Considere que o carro tem o consumo de 1 litro de gasolina a cada 13km rodado. 
E o preço do litro de gasolina é de R$ 2,20.*/
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        float gasolina = 2.20f;
        float kmrodado = 0;

        System.out.println("Informe quantos km foram rodados: ");
        kmrodado = Float.parseFloat(leitor.nextLine());

        float consumo = kmrodado / 13;
        float preco = consumo * gasolina;

        System.out.println("O valor a ser reembolsado é: "+ preco+ " reais");

        leitor.close();
    }
}

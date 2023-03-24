package aula02;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        int qtd_numeros = 0;
        double numero = 0;
        double maximo = Double.MIN_VALUE;
        double minimo = Double.MAX_VALUE;

        System.out.print("Digite um número: ");
        double primeiro = sc.nextDouble();

        while (numero != primeiro) {
            System.out.print("Digite um número: ");
            numero = sc.nextDouble();

            if (numero != primeiro) {
                total += numero;
                qtd_numeros++;

                if (numero > maximo) {
                    maximo = numero;
                }
                if (numero < minimo) {
                    minimo = numero;
                }
            }
        }
        
        sc.close();
        
        double media = total / qtd_numeros;

        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Média: " + media);
        System.out.println("Total de números lidos: " + qtd_numeros);

       
    }
}

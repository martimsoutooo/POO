package aula02;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o valor de graus que quer converter (celsius->fahrenheit)- ");

        sc.close();
        
        Double cel = sc.nextDouble();

        Double fah = (1.8 * cel) + 32;

        System.out.println(" " + fah);
        
    }
}

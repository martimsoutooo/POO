package aula02;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor de v1- ");
        Double v1 = sc.nextDouble();
        
        System.out.print("Entre com o valor de v2- ");
        Double v2 = sc.nextDouble();
        
        System.out.print("Entre com o valor de d1- ");
        Double d1 = sc.nextDouble();
        
        System.out.print("Entre com o valor de d2- ");
        Double d2 = sc.nextDouble();

        sc.close();

        Double t1 = d1/v1;
        Double t2 = d2/v2;

        Double d = d1 + d2;
        Double t = t1 + t2;

        Double vm = d/t;

        System.out.println(" " + vm);



    }
}

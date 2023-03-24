package aula02;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do cateto A- ");
        int catetoA = sc.nextInt();


        System.out.print("Qual o valor do cateto B- ");
        int catetoB = sc.nextInt();

        sc.close();

        if (catetoA <= 0 || catetoB <= 0) {
            System.out.println("Os valores dos catetos têm que ser positivos.");
            return;
        }

        double hipotenusaC = Math.sqrt(Math.pow(catetoA, 2)+Math.pow(catetoB, 2));
        double anguloA = Math.toDegrees(Math.acos(catetoA/hipotenusaC));

        System.out.println("O valor da hipotenusa é  " + hipotenusaC);
        System.out.println("O valor em graus do ângulo ente A e C é  " + anguloA);
    }
}

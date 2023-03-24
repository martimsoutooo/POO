package aula02;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a distância que quer converter (km->milhas)- ");
        
        Double dkm = sc.nextDouble();

        sc.close();

        Double dm = dkm * 1.609;

        System.out.println(" "+ dm );
    }
}

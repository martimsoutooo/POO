package aula02;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a coordenada x de p1-");
        int xp1 = sc.nextInt();

        System.out.print("Entre com a coordenada y de p1-");
        int yp1 = sc.nextInt();

        System.out.print("Entre com a coordenada x de p2-");
        int xp2 = sc.nextInt();

        System.out.print("Entre com a coordenada y de p2-");
        int yp2 = sc.nextInt();

        sc.close();

        Double distancia = Math.sqrt((Math.pow((xp2-xp1), 2))+(Math.pow((yp2-yp1), 2)));

        System.out.println("A distância entre os dois pontos é  " + distancia);
    }
}

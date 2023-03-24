package aula02;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o tempo a ser convertido (s->hh:mm:ss)- ");
        int segundosConverter = sc.nextInt();

        sc.close();

        int horas = segundosConverter / 3600;
        int minutos = (segundosConverter % 3600) / 60;
        int segundos = segundosConverter % 60;

        System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);



        
    }
}

package aula11.exercicio1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class exercicio1{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do ficheiro: ");

        String file = sc.nextLine();
        Scanner input = new Scanner(new FileReader(file));

        while (input.hasNext()) {
            if (input.next().matches("3[a-zA-Z]+")) {
                System.out.println(input.next());
            }
        }

    }
}
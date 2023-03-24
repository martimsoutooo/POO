package aula02;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a massa(Kg)- ");
        Double m = sc.nextDouble(); 

        System.out.print("Entre com a temperatura inicial- ");
        Double ti = sc.nextDouble();

        System.out.print("Entre com a temperatura final- ");
        Double tf = sc.nextDouble();
        
        sc.close();
        
        Double q =  m * (tf-ti) * 4184;

        System.out.println(" " + q);
    }
}

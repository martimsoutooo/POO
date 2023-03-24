package aula02;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor que foi investido- ");
        Double val = sc.nextDouble();

        System.out.print("Entre com o valor da taxa- ");
        Double tax = (sc.nextDouble())/100 + 1;

        sc.close();

        int i = 0;
        while (i != 3){
            i += 1;
            val *= tax;
            
        }
          
        System.out.println(" " + val );

        
        
    }
}

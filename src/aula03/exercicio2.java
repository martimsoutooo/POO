package aula03;

import java.util.Scanner;
import Utils.UserInputDouble;


public class exercicio2 {
    public static void main(String[] args) {
        double tax, montanteInv, val;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o montante investido- ");
        montanteInv = UserInputDouble.superior(0);


        while (montanteInv % 1000 != 0){
            System.out.println("Insira um número múltiplo de 1000");
            montanteInv = UserInputDouble.superior(0);
        }

        System.out.print("Insira o valor da taxa- ");
        tax = (UserInputDouble.superior(0));
        
        val = montanteInv;
        int i = 0;
        while (i != 12){
            i += 1;
            val *= (tax/100 + 1);
            System.out.println("" + val);
        }

        sc.close();
    }
}

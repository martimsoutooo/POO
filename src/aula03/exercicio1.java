package aula03;
import java.util.Scanner;
import Utils.UserInputInt;
import Utils.numbers;
public class exercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza um número inteiro- ");
        int number, sum;

        number = UserInputInt.superior(0);

        sum = 0;

        for (int j = 2; j <= number; j++ ){
            if (numbers.isPrime(j)){
                sum += j;
            }
        }
        
        System.out.println(sum);

        sc.close();

    }
}

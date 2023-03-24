package aula03;

import java.util.Scanner;
import java.util.Random;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();

        do{
            int number = rdm.nextInt(101);

            int tentativas = 0;

            while (true){
                System.out.print("Tenta acertar o número entre 1 e 100: ");
                int guessNumber = sc.nextInt();

                if (guessNumber == number){
                    System.out.printf("Acertaste, necessitaste de %d tentativa(s)", tentativas);
                    break;
                }
                else if (guessNumber < number ){
                    System.out.println("Higher");
                }
                else{
                    System.out.println("Lower");
                }
                
                tentativas += 1;
            }

            System.out.print("Pretende continuar? Prima (S)im. ");
            String resposta = sc.next();
            if (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("Sim")) {
                break;
            }

        }while (true);
    
        sc.close();
    }
}

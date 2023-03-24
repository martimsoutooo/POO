package aula03;

import java.util.Scanner;
import Utils.UserInputInt;
import Utils.numbers;
import java.util.Random;
import java.text.DecimalFormat;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();
        DecimalFormat df = new DecimalFormat("#.#");
        
        
        System.out.print("Insira quantos alunos tem a turma- ");
        int numeroAlunos =  UserInputInt.superior(0);

        

        double[][] notasTurma = new double[numeroAlunos][3];

        for (int i = 0; i < numeroAlunos; i++){
            notasTurma[i][0]= rdm.nextDouble() * 20.0;
            notasTurma[i][1]= rdm.nextDouble() * 20.0;
        }

        System.out.println("NotaT  NotaP  Pauta");
        for(int i = 0; i < numeroAlunos; i++){
            double notaT = notasTurma[i][0];
            double notaP = notasTurma[i][1];
            double notaFinal = numbers.reproved(notaT, notaP);
            String pauta = (notaFinal == 66.0) ? "66" : df.format(notaFinal);
            System.out.printf("%5s  %5s  %5s\n", df.format(notaT), df.format(notaP), pauta);

        }
        
        sc.close();
        
    }
}

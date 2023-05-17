package aula12.exercicio1;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class exercicio1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o nome do ficheiro: ");
        String filename = sc.nextLine();
        sc.close();

        ArrayList<String> palavrasDiferentes = new ArrayList<String>();

        try{
            int counter = 0;
            Scanner file = new Scanner(new FileReader(filename));
            while(file.hasNext()){
                counter++;
                String palavra = file.next();
                if(!palavrasDiferentes.contains(palavra)){
                    palavrasDiferentes.add(palavra);
                }
            }
            file.close();

            System.out.println("Número Total de Palavras: " + counter);
            System.out.println("Número de Diferentes Palavras: " + palavrasDiferentes.size());
        }
        catch(FileNotFoundException e){
            System.out.println("Ficheiro não encontrado");
        }

    }
}

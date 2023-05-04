package aula10.exercicio4;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;


public class exercicio4 {
    public static void main(String[] args) throws IOException{ 
        ArrayList<String> wordsList = new ArrayList<>();
        Scanner input = new Scanner(new FileReader("words.txt")); 

        while (input.hasNext()) { 
            String word = input.next();
            if (word.length() > 2 && !(word.endsWith("s"))) {
                wordsList.add(word);
                if(!word.matches("[a-zA-Z]+")) {
                    wordsList.remove(word);
                }
            }
            else {
                System.out.println(word);
            }
            
        }
        System.out.println(wordsList);
    }
}
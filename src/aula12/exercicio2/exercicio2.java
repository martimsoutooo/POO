package aula12.exercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha o ficheiro: ");
        String filename = sc.nextLine();
        sc.close();
        
        Map<Character, Map<String, Integer>> wordGroups = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    word = processWord(word);
                    if (word.length() >= 3) {
                        char initial = word.charAt(0);
                        Map<String, Integer> wordsMap = wordGroups.getOrDefault(initial, new HashMap<>());
                        wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
                        wordGroups.put(initial, wordsMap);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry<Character, Map<String, Integer>> entry : wordGroups.entrySet()) {
            char initial = entry.getKey();
            Map<String, Integer> wordsMap = entry.getValue();
    
            System.out.print(initial + ":");
            for (Map.Entry<String, Integer> wordEntry : wordsMap.entrySet()) {
                String word = wordEntry.getKey();
                int count = wordEntry.getValue();
                System.out.print(" " + word  + ", " + count + ";");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static String processWord(String word) {
        // Remove pontuação e converte para minúsculas
        word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return word;
    }

    
}

package aula10.exercicio3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class exercicio3 {
   
    public static void main(String[] args) {
        Map <Character, List<Integer>> mapa = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira uma String: ");
        String str = scanner.nextLine();

        char[] lista = str.toCharArray();

        for (int i = 0; i < lista.length; i++) {
            if (! mapa.containsKey(lista[i])) {
                mapa.put(lista[i], new ArrayList<Integer>());
            }
            mapa.get(lista[i]).add(i);
        }

        System.out.println(mapa);
        
        scanner.close();
    }
}
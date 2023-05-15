package aula11.exercicio1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

 public class exercicio1 {
    public static void main(String[] args) {

        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();

        String filename = "major.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] palavras = linha.split("\\s+");
                for (int i = 0; i < palavras.length - 1; i++) {
                    if (palavras[i].length() >= 3) {
                        String palavra1 = palavras[i];
                        String palavra2 = palavras[i+1];

                        if (isSeparador(palavra2)) {
                            palavra2 = "separador";
                        }
                        if (map.containsKey(palavra1)) {
                            HashMap<String, Integer> innerMap = map.get(palavra1);
                            if (innerMap.containsKey(palavra2)) {
                                innerMap.put(palavra2, innerMap.get(palavra2) + 1);
                            } else {
                                innerMap.put(palavra2, 1);
                            }
                        } else {
                            HashMap<String, Integer> innerMap = new HashMap<>();
                            innerMap.put(palavra2, 1);
                            map.put(palavra1, innerMap);
                        }
                    } 
                }
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        for (String palavra1 : map.keySet()) {
            System.out.print(palavra1 + "={");
            HashMap<String, Integer> innerMap = map.get(palavra1);
            for (String palavra2 : innerMap.keySet()) {
                System.out.print(palavra2 + "=" + innerMap.get(palavra2) + ", ");
            }
            System.out.println("}");
        }
    }

    public static boolean isSeparador(String word) {
        if(word.matches("\\w*[\\t\\n.,:'‘’;?!\\-*{}=+&/()\\[\\]”“\"']\\w*")) {
            return true;
        }
        else {
            return false;
        }
    }
}
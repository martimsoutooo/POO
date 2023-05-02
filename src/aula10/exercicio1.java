package aula10;

import java.util.HashMap;
import java.util.Map;

public class exercicio1 {
    public static void main(String[] args) {
        Map<String, Book> mapa = new HashMap<>();

        mapa.put("Action ", new Book("As Aventuras do Martim", "Filipe Oliveira", 2004));
        mapa.put("Adventure ", new Book("O Abdul no Enterro", "Pylance", 2000));
        mapa.put("Comedy ", new Book("A onça que foi perdida", "Belhice", 2018));
        mapa.put("Drama ", new Book("A pausa pro nite", "Regal", 2013));
        mapa.put("Thriller ", new Book("A belhice foi enterrada", "João Reis", 2019));
        mapa.remove("Action");
        mapa.replace("Adventure", new Book("O Abdul no Enterro", "Pylance", 2001));

        for (String key : mapa.keySet()) {
            System.out.println(key + " " + mapa.get(key));
        }

        for (Book value : mapa.values()) {
            System.out.println(value);
        }

        for (String b : mapa.keySet()){
            System.out.println(b);
        }


        

        

    }

}
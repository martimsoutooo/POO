package aula10.exercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.lang.Math;


public class exercicio2 {
    public static void main(String[] args) {
        Map<String, ArrayList<Book>> mapa = new TreeMap<>();
        String [] generos = {"Action", "Adventure", "Comedy", "Drama", "Thriller"};
        
        for (int i = 0; i < 5; i++) {
           mapa.put(generos[i], new ArrayList<Book>());
        }
        
        mapa.get("Action").add(new Book("As Aventuras do Martim", "Filipe Oliveira", 2004));
        mapa.get("Adventure").add(new Book("O Abdul no Enterro", "Pylance", 2000));
        mapa.get("Comedy").add(new Book("A onça que foi perdida", "Belhice", 2018));
        mapa.get("Drama").add(new Book("A pausa pro nite", "Regal", 2013));
        mapa.get("Thriller").add(new Book("A belhice foi enterrada", "João Reis", 2019));
        mapa.get("Action").add(new Book("As Aventuras do Martim", "Filipe Oliveira", 2004));


        for (String key : mapa.keySet()) {
            System.out.println(key + " " + mapa.get(key));
        }

        for (String key : mapa.keySet()) {
            System.out.println(mapa.get(key)); 
        }

        for (String b : mapa.keySet()){
            System.out.println(b);
        }
        
        System.out.println(searchBook("Action", mapa)); 

    } 
    public static Book searchBook(String gender, Map<String, ArrayList<Book>> mapa){
        int n = (int) Math.random() * mapa.get(gender).size();
        return mapa.get(gender).get(n);
    }

}


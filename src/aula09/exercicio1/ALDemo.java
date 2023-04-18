package aula09.exercicio1;

import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import aula06.exercicio1.Pessoa;
import aula06.exercicio1.DateYMD;



public class ALDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();

        for (int i = 10; i <= 100; i+=10)
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);
        System.out.println(c2.indexOf("Chuva"));
        System.out.println(c2.contains("Chuva"));
        System.out.println(c2.lastIndexOf("Calor"));
        System.out.println(c2);
        c2.set(0, "Sol");
        System.out.println(c2);

        Set<Pessoa> c3 = new HashSet<>();

        c3.add(new Pessoa("José", 657456734, new DateYMD(15, 2, 2019)));
        c3.add(new Pessoa("Maria", 987654321, new DateYMD(23, 7, 2011)));
        c3.add(new Pessoa("Rui", 793453568, new DateYMD(11, 5, 2005)));
        c3.add(new Pessoa("Beatriz", 987654321,new DateYMD(17, 7, 2004)));
        c3.add(new Pessoa("Zakhar", 123456789, new DateYMD(15, 6, 2003)));
        c3.add(new Pessoa("Beatriz", 987654321,new DateYMD(17, 7, 2004)));
        c3.add(new Pessoa("Beatriz", 987654321,new DateYMD(17, 7, 2004)));

        System.out.println("\n");
        for (Pessoa pessoa : c3) {
            System.out.println(pessoa);
        }

    }
}

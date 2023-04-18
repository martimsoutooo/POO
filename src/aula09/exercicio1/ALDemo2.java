package aula09.exercicio1;

import java.util.TreeSet;
import java.util.Set;
import aula07.exercicio2.DateYMD;
import aula07.exercicio2.Date;
import aula07.exercicio2.DateND;

public class ALDemo2 {
    public static void main(String[] args) {
        Set<Date> c4 = new TreeSet<>();
        c4.add(new DateYMD(15, 2, 2019));
        c4.add(new DateYMD(23, 7, 2011));
        c4.add(new DateYMD(11, 5, 2005));
        c4.add(new DateYMD(17, 7, 2004));
        c4.add(new DateYMD(17, 7, 2004));
        c4.add(new DateND(18, 7, 2004));

        for (Date date : c4) {
            System.out.println(date);
        }
    }
   
}

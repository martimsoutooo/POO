package aula02;

public class exercicio9 {
    public static void main(String[] args) {
        for (int i = 100; i >= 0; i--){
            if (i%10 != 0 || i == 100){
                System.out.print(i +", ");
            }
            else{
                System.out.println(i +", ");
            }             
        }   
    } 
}

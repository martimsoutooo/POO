package Utils;
import java.util.Scanner;

public class UserInputInt {
    private static Scanner sc = new Scanner(System.in); 
        public static int superior(int a){
            int n ;
            n = sc.nextInt();
            while (n<a){
                System.out.println("Introduza um número superior a " + a);
                n = sc.nextInt();
            };
            return n;
        }
}
    
    
    

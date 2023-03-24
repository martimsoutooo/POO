package Utils;
import java.util.Scanner;

public class UserInputDouble {
    private static Scanner sc = new Scanner(System.in); 
        public static double superior(double a){
            double n ;
            n = sc.nextDouble();
            while (n<a){
                System.out.println("Introduza um número superior a " + a);
                n = sc.nextDouble();
            };
            return n;
        }
}
    
    
    

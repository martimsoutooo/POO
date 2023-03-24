package Utils;

public class numbers {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        
        if (n == 2) {
            return true;
        }
        
        if (n % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }


    public static double reproved(double notaP, double notaT){
        if ((notaP + notaT)/2 < 7){
            return 66;
        }
        else{
            return (0.4 * notaT) + (0.6 * notaP);
        }
    }
}

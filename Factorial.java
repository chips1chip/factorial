import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input number
        int fact = 1; 
        
        for (int i = 1; i <= n; i++) {
            fact *= i; // Calculate factorial
            System.out.println(fact); // Output factorial
        }
        sc.close();
    }
}

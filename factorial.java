import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        // base case
        if(n == 0 || n == 1) 
            return 1;
        // recursive case
        return n*fact(n-1);
    }
    public static void main(String args[]) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("The factorial is: " + fact(n));
    }
}

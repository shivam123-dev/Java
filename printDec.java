import java.util.Scanner;   
public class printDec {
    public static void print(int n) {
        // base case
        if(n == 0) {
            return;
        }
        // recursive case
        System.out.println(n);
        print(n-1);
    }
    public static void main(String args[]) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        print(n);
    }
}

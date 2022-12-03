import java.util.Scanner;
public class methods {
    public static void printName(String name) {
        System.out.println(name);
    }
    public static int printSum(int a, int b) {
        return a+b;
    }
    public static void main(String args[]) {
        // printName("Shivam");
        
        // addition of two numbers
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(printSum(a, b));    
    }
}

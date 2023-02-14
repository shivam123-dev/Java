import java.util.Scanner;
public class MyClass14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revN = 0;
        sc.close();
        while(n > 0) {
            revN = (revN*10) + n%10;
            n /= 10;            
        }
        System.out.println("Reverse of the number is "+revN);
    }
}

import java.util.*;
public class MyClass26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int revN = 0;
        while (n > 0) {
            revN = (revN * 10) + n % 10;
            n /= 10;
        }
        System.out.println(revN);
    }
}
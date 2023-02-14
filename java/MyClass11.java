import java.util.*;
public class MyClass11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n%2 == 0) {
            System.out.println("Cannot reverse");
        } else {
            int revN = 0;
            while(n > 0) {
                revN = (revN * 10) + n%10;
                n /= 10;
            }
            System.out.println(revN);
        }
    }

}
import java.util.*;
public class MyClass37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int f = 0;
        for(int i=1;i<=n;i++) {
            if((int)Math.sqrt(n) == i) {
                System.out.println("TRUE");
                f = 1;
            }
        }
        if(f == 0)
            System.out.println("FALSE");
    }
}

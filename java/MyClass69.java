import java.util.*;
public class MyClass69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        sc.close();
        int f = 0;
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(i*i == n) {
                f = 1;
                System.out.println("TRUE");
                break;
            }
        }
        if(f == 0) {
            System.out.println("FALSE");
        }
    }
}
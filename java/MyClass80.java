import java.util.*;
public class MyClass80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = Integer.parseInt(sc.nextLine());
        String s = String.valueOf(n);
        for(int i=0;i<s.length();i++) {
            if((int)s.charAt(i) % 2 == 0) {
                count++;
            }
        }
        if(count >= 3) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
        sc.close();
    }
}
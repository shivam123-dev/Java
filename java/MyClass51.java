import java.util.*;
public class MyClass51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        for(int i=0;i<s.length();i++) {
            if(i%2!=0)
                System.out.print(s.charAt(i));
        }
    }
}

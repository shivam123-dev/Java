import java.util.*;
public class MyClass77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++) {
            char temp = s.charAt(i);
            if(temp >= 'a' && temp <= 'z') {
                if(temp != 'a' && temp != 'e' && temp != 'i' && temp != 'o' && temp != 'u') {
                    System.out.print(temp);
                }
            }
        }
    }
}
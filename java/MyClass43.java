import java.util.*;
public class MyClass43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int count_hash = 0, count_star = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '#') {
                count_hash++;
            } else if(s.charAt(i) == '*') {
                count_star++;
            }
        }
        System.out.println(count_hash-count_star);
    }  
}

import java.util.*;
public class lastchar {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == ' ' && ((s.charAt(i-1) >='a' && s.charAt(i-1)<='z') || (s.charAt(i - 1) >= 'A'
                    && s.charAt(i - 1) <= 'Z')) && s.charAt(i-1) != ' ') {
                System.out.print(s.charAt(i-1));
            }
            else if(i == s.length()-1 && ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')||(s.charAt(i)>='A' && s.charAt(i)<='Z'))) {
                System.out.print(s.charAt(i));
            }
        }
    }
}

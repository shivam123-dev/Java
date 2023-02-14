import java.util.*;
public class MyClass66 {
    public static boolean isDigit(char a) {
        if(a >= '0' && a <= '9') {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String res = "";
        res += s.charAt(s.length()-1);
        for(int i=s.length()-2;i>=0;i--) {
            char temp = s.charAt(i);
            if(temp == ' ') {
                char temp1 = s.charAt(i-1);
                if(!isDigit(temp1) && temp1 != ' ') {
                    res += temp1;
                }
            }
        }
        for(int i=res.length()-1;i>=0;i--)
            System.out.print(res.charAt(i));
    }
}
import java.util.*;
public class MyClass67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int countC = 0, countS = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == ' ') {
                countS++;
            } else {
                countC++;
            }
        }
        System.out.println("No of spaces : "+countS+" and characters : "+countC);
    }
}
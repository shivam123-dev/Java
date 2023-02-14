import java.util.*;
public class MyClass45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int f = 0;
        for(int i=0;i<s.length();i++) {
            char t = s.charAt(i);
            if(t=='a'||t=='A'||t=='e'||t=='E'||t=='i'||t=='I'||t=='o'||t=='O'||t=='u'||t=='U') {
                System.out.println(t);
                f = 1;
                break;
            }
        }
        if(f == 0) {
            System.out.println("No Vowel");
        }
    }
}

import java.util.*;
public class MyClass71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int cv = 0, cc = 0;
        for(int i=0;i<s.length();i++) {
            char temp = s.charAt(i);
                if((temp >= 'a' && temp <= 'z')||(temp>='A'&&temp<='Z')) {
                if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'
                ||temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U') {
                    cv++;
                } else {
                    cc++;
                }
            }
        }
        System.out.println("Vowels count - "+cv);
        System.out.println("Consonants count - "+cc);
    }
}
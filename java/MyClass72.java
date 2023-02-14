import java.util.*;
public class MyClass72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        char res = 'u';
        for(int i=0;i<s.length();i++) {
            char temp = s.charAt(i);
            if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'
            ||temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U') {
                if((int)res > (int)temp) {
                    res = temp;
                }
            }
        }
        System.out.println(res);
    }
}
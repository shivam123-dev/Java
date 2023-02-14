import java.util.*;
public class MyClass33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String str = "";
        str += s.charAt(s.length()-1);
        for(int i=s.length()-2;i>=0;i--) {
            if(s.charAt(i) == ' ') {
                char temp = s.charAt(i-1);
                if((temp>='a'&&temp<='z')||(temp>='A'&&temp<='Z')) {
                    str += temp;
                }
            }
        }
        for(int i=str.length()-1;i>=0;i--)
            System.out.print(str.charAt(i));
    }
}

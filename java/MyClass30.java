import java.util.*;

public class MyClass30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s.toLowerCase();
        sc.close();
        String temp = "";
        for(int i=0;i<s.length();i++) {
            if(!temp.contains(Character.toString(s.charAt(i)))) {
                temp += s.charAt(i);
            }
        }
        System.out.println(temp);
    }

}
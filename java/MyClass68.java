import java.util.*;
public class MyClass68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String res = "";
        ArrayList<String> temp = new ArrayList<>();
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            String r = ""+c;
            if(temp.contains(r) == false) {
                temp.add(r);
                res += c;
            }
        }
        System.out.println(res);
    }
}
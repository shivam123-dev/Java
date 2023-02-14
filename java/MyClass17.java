import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class MyClass17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        ArrayList<String> res = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            char temp = s.charAt(i);
            if(temp == 'a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'){
                String a = "";
                a += temp;
                res.add(a);
            }
        }
        Collections.sort(res);
        System.out.println(res.get(0));
    }
}

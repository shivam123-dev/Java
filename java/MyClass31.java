import java.util.*;
public class MyClass31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        ArrayList<String> temp = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            char t = s.charAt(i);
            if(t=='a'||t=='A'||t=='e'||t=='E'||
                t=='i'||t=='I'||t=='o'||t=='O'||
                t=='u'||t=='U') {
                    temp.add(""+t);
                }
        }
        Collections.sort(temp);
        System.out.println(temp.get(0));
    }
}

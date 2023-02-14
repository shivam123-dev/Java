import java.util.*;
public class MyClass70 {
    public static boolean isPrime(int a) {
        for(int i=2;i<=(int)Math.sqrt(a);i++) {
            if(a%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        ArrayList<Integer> temp = new ArrayList<>();
        String str = "";
        for(int i=0;i<s.length();i++) {
            char t = s.charAt(i);
            if(t != ' ' && t!=';') {
                str += t;
            } else {
                int a = Integer.parseInt(str);
                str = "";
                if(a != 1 && a != 0 && isPrime(a) == true) {
                    temp.add(a);
                }
            }
        }
        Collections.sort(temp);
        Collections.reverse(temp);
        System.out.println(temp.size()+temp.get(1));
    }
}
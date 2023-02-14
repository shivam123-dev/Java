import java.util.*;
public class MyClass52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String str = "";
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)!=';') {
                if(s.charAt(i)!=' ') {
                    str += s.charAt(i);
                    continue;
                } else {
                    int check = Integer.parseInt(str);
                    str = "";
                    if(isPrime(check)) {
                        res.add(check);
                    }
                }
            }
        }
        Collections.sort(res);
        Collections.reverse(res);
        // for(int i=0;i<res.size();i++) {
        //     System.out.print(res.get(i)+" ");
        // }
        // System.out.println(res.get(1));
        System.out.println(res.size()+res.get(1));     
    }
    static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }
        for(int i=2;i<num;i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
}

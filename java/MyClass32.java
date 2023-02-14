import java.util.*;
public class MyClass32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[12];
        for(int i=0;i<12;i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<12;i++) {
            int temp = arr[i];
            if(isPrime(temp)) {
                a.add(temp);
            }
        }
        Collections.sort(a);
        Collections.reverse(a);
        int n = a.size();
        int t = a.get(1);
        System.out.println(n+t);
    }
    static boolean isPrime(int num) {
        if(num <= 1)
            return false;
        for(int i=2;i<Math.sqrt(num);i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
import java.util.*;
public class MyClass42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = Integer.parseInt(sc.nextLine());
        int w = Integer.parseInt(sc.nextLine());
        if(w % 2 != 0 && w < 2 && v>w) {
            System.out.println("INVALID INPUT");
        }
        sc.close();
        int z = 2*v;
        int y = (w-z)/2;
        int x = v-y;
        System.out.println("TW="+x+" FW="+y);        
    }
}

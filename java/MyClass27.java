import java.util.*;
public class MyClass27 {
    public static void main(String[] args) {
        int id[] = new int[4];
        String name[] = new String[4];
        String cab[] = new String[4];
        int rating[] = new int[4];
        int fees[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            cab[i] = sc.nextLine();
            rating[i] = sc.nextInt();
            sc.nextLine();
            fees[i] = sc.nextInt();
            sc.nextLine();
        }
        String q = sc.nextLine();
        sc.close();
        int c = 0;
        for(int i=0;i<cab.length;i++) {
            if(cab[i].equals(q) && rating[i] > 5) {
                System.out.println(rating[i]);
                c = 1;
            }
        }
        if(c == 0) {
            System.out.println("NO HOTEL WITH GIVEN FACILITY");
        }
    }
}
import java.util.*;
public class MyClass21{
    public static void main(String[] args) {
        int id[] = new int[4];
        String country[] = new String[4];
        String side[] = new String[4];
        double price[] = new double[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            country[i] = sc.nextLine();
            side[i] = sc.nextLine();
            price[i] = sc.nextDouble();
            sc.nextLine();
        }
        String q = sc.nextLine();
        sc.close();
        int f = 0;
        for(int i=0;i<4;i++) {
            if(q.equals(side[i])) {
                System.out.println(id[i]);
                f = 1;
            }
        }
        if(f == 0) {
            System.out.println("No such side.");
        }
    }
}
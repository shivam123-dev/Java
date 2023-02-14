import java.util.*;
public class MyClass64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        String name[] = new String[4];
        String type[] = new String[4];
        int price[] = new int[4];
        boolean flight[] = new boolean[4];
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            type[i] = sc.nextLine();
            price[i] = Integer.parseInt(sc.nextLine());
            flight[i] = Boolean.parseBoolean(sc.nextLine());
        }
        int reg = Integer.parseInt(sc.nextLine());
        String p = sc.nextLine();
        sc.close();
        int maxi = price[0];
        for(int i=1;i<price.length;i++) {
            if(maxi < price[i]) {
                maxi = price[i];
            }
        }
        System.out.println(maxi);
        for(int i=0;i<4;i++) {
            if(p.equalsIgnoreCase(type[i]) && flight[i] && reg==id[i]) {
                System.out.println(name[i]+":"+price[i]);
            }
        }

    }
}
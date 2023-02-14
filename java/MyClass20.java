import java.util.*;
public class MyClass20{
    public static void main(String[] args){
        int regNo[] = new int[4];
        String name[] = new String[4];
        String type[] = new String[4];
        int price[] = new int[4];
        String flight[] = new String[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            regNo[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            type[i] = sc.nextLine();
            price[i] = sc.nextInt();
            sc.nextLine();
            flight[i] = sc.nextLine();
        }
        int q1 = sc.nextInt();
        sc.nextLine();
        String q2 = sc.nextLine();
        sc.close();
        int max = price[0];
        for(int i=1;i<price.length;i++) {
            if(max < price[i]) {
                max = price[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<4;i++) {
            if(q1 == regNo[i] && q2.equals(type[i]) && flight[i].equals("true")) {
                System.out.println(name[i]+":"+price[i]);
            }
        }
    }
}